/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
/**import Client.Client;
import EmailSender;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordRecoveryTest {

    @Test
    public void testUserCreationAndPasswordRecovery() {
        Client client = new Client("localhost", 8080);

        // 1. Crear nuevo usuario
        HashMap<String, Object> createUserSession = new HashMap<>();
        createUserSession.put("username", "newUser");
        createUserSession.put("password", "securePassword");
        createUserSession.put("email", "newUser@example.com");

        HashMap<String, Object> response = client.sentMessage("/signUpUser", createUserSession);
        assertNotNull(response, "Response from user creation should not be null");
        assertEquals("success", response.get("status"), "User should be created successfully");

        // 2. Solicitar recuperación de contraseña
        HashMap<String, Object> recoverySession = new HashMap<>();
        recoverySession.put("email", "newUser@example.com");

        HashMap<String, Object> recoveryResponse = client.sentMessage("/sendVerificationCode", recoverySession);
        assertNotNull(recoveryResponse, "Response from password recovery should not be null");
        assertEquals("email_sent", recoveryResponse.get("status"), "Verification email should be sent");

        // 3. Simular envío de correo y verificar
        String verificationCode = EmailSender.sendEmail("newUser@example.com");
        assertNotNull(verificationCode, "Verification code should be generated and sent");
        assertEquals(6, verificationCode.length(), "Verification code should have 6 digits");
    }
}*/

