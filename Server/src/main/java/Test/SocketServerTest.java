package Test;

import Domain.Message;
import SocketServer.SocketServer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class SocketServerTest {

    private ExecutorService serverExecutor;

    @BeforeEach
    void setUp() {
        // Iniciar el servidor en un thread separado
        serverExecutor = Executors.newSingleThreadExecutor();
        serverExecutor.submit(() -> {
            SocketServer.main(new String[]{});
        });

        // Esperar un momento para que el servidor inicie
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    void tearDown() {
        serverExecutor.shutdownNow();
        try {
            serverExecutor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testServerLoginRequest() {
        try (Socket socket = new Socket("localhost", SocketServer.port)) {
            // Preparar mensaje de prueba
            Message testMessage = new Message();
            testMessage.setContext("/checkLogIn");
            HashMap<String, Object> session = new HashMap<>();
            session.put("username", "testUser");
            session.put("password", "testPass");
            testMessage.setSession(session);

            // Enviar mensaje
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(testMessage);

            // Leer respuesta
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Message response = (Message) in.readObject();

            // Verificar respuesta
            assertNotNull(response);
            assertEquals("/checkLogInResponse", response.getContext());
            assertNotNull(response.getSession());

        } catch (IOException | ClassNotFoundException e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }

    @Test
    void testServerMultipleRequests() {
        int numRequests = 3;
        for (int i = 0; i < numRequests; i++) {
            try (Socket socket = new Socket("localhost", SocketServer.port)) {
                // Preparar mensaje de prueba
                Message testMessage = new Message();
                testMessage.setContext("/checkLogIn");
                HashMap<String, Object> session = new HashMap<>();
                session.put("username", "testUser" + i);
                session.put("password", "testPass" + i);
                testMessage.setSession(session);

                // Enviar mensaje
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(testMessage);

                // Leer respuesta
                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                Message response = (Message) in.readObject();

                // Verificar respuesta
                assertNotNull(response);
                assertEquals("/checkLogInResponse", response.getContext());

            } catch (IOException | ClassNotFoundException e) {
                fail("Exception occurred in request " + i + ": " + e.getMessage());
            }
        }
    }

    @Test
    void testInvalidRequest() {
        try (Socket socket = new Socket("localhost", SocketServer.port)) {
            // Preparar mensaje de prueba con contexto inválido
            Message testMessage = new Message();
            testMessage.setContext("/invalidContext");
            testMessage.setSession(new HashMap<>());

            // Enviar mensaje
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(testMessage);

            // Leer respuesta
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Message response = (Message) in.readObject();

            // Verificar que el servidor maneja apropiadamente la petición inválida
            assertNotNull(response);

        } catch (IOException | ClassNotFoundException e) {
            fail("Exception occurred: " + e.getMessage());
        }
    }
}
