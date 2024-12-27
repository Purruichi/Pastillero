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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class OverloadTest {

    @Test
    public void testClientOverloadHandling() throws InterruptedException {
        final int THREAD_COUNT = 50; // Número de hilos para pruebas concurrentes
        final int REQUESTS_PER_THREAD = 20; // Número de solicitudes por hilo
        final String CONTEXT = "/addUserMed";

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        Client client = new Client("localhost", 8080);

        for (int i = 0; i < THREAD_COUNT; i++) {
            executor.execute(() -> {
                for (int j = 0; j < REQUESTS_PER_THREAD; j++) {
                    HashMap<String, Object> session = new HashMap<>();
                    session.put("medicineId", Thread.currentThread().getId() + "-" + j);
                    try {
                        HashMap<String, Object> response = client.sentMessage(CONTEXT, session);
                        assertNotNull(response, "Response should not be null");
                        assertTrue(response.containsKey("medicineId"), "Response should contain 'medicineId'");
                    } catch (Exception e) {
                        fail("Exception occurred during overload test: " + e.getMessage());
                    }
                }
            });
        }

        executor.shutdown();
        boolean terminated = executor.awaitTermination(1, TimeUnit.MINUTES);
        assertTrue(terminated, "All threads should complete within the time limit");
    }
}