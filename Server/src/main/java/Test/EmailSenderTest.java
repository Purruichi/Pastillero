package Test;


import Email.EmailSender;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

public class EmailSenderTest {

    @Test
    void testSendEmailSuccess() {
        try (MockedStatic<Transport> mockedTransport = Mockito.mockStatic(Transport.class)) {
            mockedTransport.when(() -> Transport.send(any()))
                    .then(invocation -> null);

            String result = EmailSender.sendEmail("test@test.com");

            assertNotNull(result);
            assertEquals(6, result.length()); // Verification code should be 6 digits
            assertTrue(result.matches("\\d+")); // Should be all digits
        }
    }

    @Test
    void testSendEmailFailure() {
        try (MockedStatic<Transport> mockedTransport = Mockito.mockStatic(Transport.class)) {
            mockedTransport.when(() -> Transport.send(any()))
                    .thenThrow(new RuntimeException("Send failed"));

            String result = EmailSender.sendEmail("test@test.com");

            assertNull(result);
        }
    }
}