package Test;

import Domain.Message;
import SocketServer.SocketServer;
import org.junit.jupiter.api.Test;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SocketServerLoadTest {

    private static final int NUM_CLIENTS = 100;
    private static final int NUM_REQUESTS_PER_CLIENT = 10;

    @Test
    void testServerUnderLoad() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(NUM_CLIENTS);
        ArrayList<Boolean> results = new ArrayList<>();

        // Start server in separate thread
        new Thread(() -> {
            SocketServer.main(new String[]{});
        }).start();

        // Wait for server to start
        Thread.sleep(1000);

        // Submit client tasks
        for (int i = 0; i < NUM_CLIENTS; i++) {
            executorService.submit(() -> {
                try {
                    for (int j = 0; j < NUM_REQUESTS_PER_CLIENT; j++) {
                        Socket socket = new Socket();

                        // Prepare test message
                        Message message = new Message();
                        message.setContext("/checkLogIn");
                        HashMap<String, Object> session = new HashMap<>();
                        session.put("username", "testUser");
                        session.put("password", "testPass");
                        message.setSession(session);

                        // Send message
                        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                        out.writeObject(message);

                        // Read response
                        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                        Message response = (Message) in.readObject();

                        results.add(response != null);

                        socket.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

        // Shutdown and wait for completion
        executorService.shutdown();
        executorService.awaitTermination(30, TimeUnit.SECONDS);

        // Verify results
        assertTrue(results.size() >= NUM_CLIENTS * NUM_REQUESTS_PER_CLIENT * 0.9); // Allow 10% failure rate
        assertTrue(results.stream().filter(r -> r).count() >= results.size() * 0.9); // 90% success rate
    }
}
