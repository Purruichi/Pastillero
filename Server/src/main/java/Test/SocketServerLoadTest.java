package Test;

import Domain.Message;
import SocketServer.SocketServer;
import Controler.CustomerControler;
import org.junit.jupiter.api.*;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

public class SocketServerLoadTest {
    private static final int PORT = 8081;
    private Thread serverThread;
    private CountDownLatch serverStarted;

    @BeforeEach
    void setUp() {
        serverStarted = new CountDownLatch(1);
        serverThread = new Thread(() -> {
            try {
                SocketServer.main(new String[]{});
                serverStarted.countDown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        serverThread.start();

        try {
            assertTrue(serverStarted.await(5, TimeUnit.SECONDS), "Server failed to start in time");
            // Dar tiempo al servidor para inicializarse completamente
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            fail("Server startup was interrupted");
        }
    }

    @AfterEach
    void tearDown() {
        if (serverThread != null) {
            serverThread.interrupt();
        }
    }

    @Test
    void testLoginRequest() {
        try (MockedStatic<CustomerControler> mockedCustomerController = Mockito.mockStatic(CustomerControler.class)) {
            // Preparar el mock para CustomerControler
            HashMap<String, String> mockUserData = new HashMap<>();
            mockUserData.put("id", "1");
            mockUserData.put("username", "testUser");
            mockedCustomerController.when(() -> CustomerControler.checkLogIn("testUser", "testPass"))
                    .thenReturn(mockUserData);

            try (Socket socket = new Socket("localhost", PORT)) {
                // Preparar mensaje de login
                Message message = new Message();
                message.setContext("/checkLogIn");
                HashMap<String, Object> session = new HashMap<>();
                session.put("username", "testUser");
                session.put("password", "testPass");
                message.setSession(session);

                // Enviar mensaje
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(message);
                out.flush();

                // Recibir respuesta
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                Message response = (Message) in.readObject();

                // Verificar respuesta
                assertNotNull(response, "Response should not be null");
                assertEquals("/checkLogInResponse", response.getContext());
                assertTrue((Boolean) response.getSession().get("check"));
                assertNotNull(response.getSession().get("userData"));
            }
        } catch (IOException | ClassNotFoundException e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    void testGetUserMeds() {
        try (MockedStatic<CustomerControler> mockedCustomerController = Mockito.mockStatic(CustomerControler.class)) {
            ArrayList<HashMap<String, String>> mockMeds = new ArrayList<>();
            HashMap<String, String> med = new HashMap<>();
            med.put("id", "1");
            med.put("name", "Aspirin");
            mockMeds.add(med);

            try (Socket socket = new Socket("localhost", PORT)) {
                Message message = new Message();
                message.setContext("/getUserMeds");
                HashMap<String, Object> session = new HashMap<>();
                session.put("user_id", "1");
                message.setSession(session);

                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(message);
                out.flush();

                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                Message response = (Message) in.readObject();

                assertNotNull(response, "Response should not be null");
                assertEquals("/getUserMedsResponse", response.getContext());
                assertNotNull(response.getSession().get("userMeds"));
            }
        } catch (IOException | ClassNotFoundException e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    void testInvalidRequest() {
        try (Socket socket = new Socket("localhost", PORT)) {
            // Preparar mensaje inválido
            Message message = new Message();
            message.setContext("/invalidEndpoint");
            message.setSession(new HashMap<>());

            // Enviar mensaje
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(message);
            out.flush();

            // Recibir respuesta
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Message response = (Message) in.readObject();

            // Verificar que se maneje correctamente el caso inválido
            assertNotNull(response, "Response should not be null");
            assertTrue(response.getSession().containsKey("error"), "Response should contain error message");
            assertEquals("/error", response.getContext());
        } catch (IOException | ClassNotFoundException e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    void testServerHandlesMultipleRequests() {
        try (MockedStatic<CustomerControler> mockedCustomerController = Mockito.mockStatic(CustomerControler.class)) {
            HashMap<String, String> mockUserData = new HashMap<>();
            mockUserData.put("id", "1");
            mockUserData.put("username", "testUser");
            mockedCustomerController.when(() -> CustomerControler.checkLogIn(any(), any()))
                    .thenReturn(mockUserData);

            int numRequests = 5;
            for (int i = 0; i < numRequests; i++) {
                try (Socket socket = new Socket("localhost", PORT)) {
                    // Preparar mensaje
                    Message message = new Message();
                    message.setContext("/checkLogIn");
                    HashMap<String, Object> session = new HashMap<>();
                    session.put("username", "testUser" + i);
                    session.put("password", "testPass" + i);
                    message.setSession(session);

                    // Enviar mensaje
                    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                    out.writeObject(message);
                    out.flush();

                    // Recibir respuesta
                    ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                    Message response = (Message) in.readObject();

                    // Verificar respuesta
                    assertNotNull(response, "Response should not be null for request " + i);
                    assertEquals("/checkLogInResponse", response.getContext());
                    assertTrue((Boolean) response.getSession().get("check"));

                } catch (IOException | ClassNotFoundException e) {
                    fail("Exception on request " + i + ": " + e.getMessage());
                }
            }
        }
    }

    @Test
    void testConnectionTimeout() {
        try (Socket socket = new Socket("localhost", PORT)) {
            socket.setSoTimeout(5000); // Set timeout to 5 seconds

            // No enviamos nada, solo esperamos
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            fail("Should have timed out");
        } catch (IOException e) {
            // Esperamos que ocurra un timeout
            assertTrue(e.getMessage().contains("timeout") || e.getMessage().contains("Connection reset"));
        }
    }
}