/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
import Client.Client;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class VulneraTest {

    @Test
    public void testInjectionAttackSimulation() {
        Client client = new Client("localhost", 8080);

        // Simular una sesión con datos maliciosos
        HashMap<String, Object> session = new HashMap<>();
        session.put("username", "admin' --");
        session.put("password", "' OR '1'='1");

        HashMap<String, Object> response = client.sentMessage("/checkLogIn", session);

        // Verificar que no se conceda acceso con datos maliciosos
        assertNotNull(response, "Response should not be null");
        assertFalse(response.containsKey("user"), "User should not be logged in with SQL injection attempt");
    }

    @Test
    public void testInvalidContextHandling() {
        Client client = new Client("localhost", 8080);

        // Enviar un contexto no válido
        HashMap<String, Object> session = new HashMap<>();
        session.put("token", "12345");

        HashMap<String, Object> response = client.sentMessage("/invalidContext", session);

        // Verificar que el cliente maneja la respuesta correctamente
        assertNotNull(response, "Response should not be null");
        assertEquals(0, response.size(), "Invalid context should return an empty response");
    }
}
