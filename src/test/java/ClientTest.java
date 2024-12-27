/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
import Client.Client;
import Message.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ClientTest {

    private Client client;
    private Socket mockSocket;
    private ObjectOutputStream mockOutputStream;
    private ObjectInputStream mockInputStream;

    @BeforeEach
    public void setUp() throws IOException {
        mockSocket = mock(Socket.class);
        mockOutputStream = mock(ObjectOutputStream.class);
        mockInputStream = mock(ObjectInputStream.class);

        client = new Client("localhost", 8080);
    }

    @Test
    public void testSentMessage_Success() throws Exception {
        // Simular respuesta del servidor
        Message mockResponse = new Message();
        mockResponse.setContext("/checkLogInResponse");
        HashMap<String, Object> sessionData = new HashMap<>();
        sessionData.put("user", "testUser");
        mockResponse.setSession(sessionData);

        // Simular flujo de entrada/salida
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(mockResponse);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        when(mockSocket.getOutputStream()).thenReturn(mockOutputStream);
        when(mockSocket.getInputStream()).thenReturn(mockInputStream);
        when(mockInputStream.readObject()).thenReturn(mockResponse);

        // Ejecutar la prueba
        HashMap<String, Object> session = new HashMap<>();
        session.put("username", "test");
        HashMap<String, Object> result = client.sentMessage("/checkLogIn", session);

        // Verificaciones
        assertNotNull(result);
        assertEquals("testUser", result.get("user"));
    }

    @Test
    public void testSentMessage_ErrorHandling() {
        // Simular error en la conexión
        doThrow(new RuntimeException("Connection error")).when(mockSocket);

        HashMap<String, Object> session = new HashMap<>();
        session.put("username", "test");

        assertThrows(RuntimeException.class, () -> {
            client.sentMessage("/unknown", session);
        });
    }
}
