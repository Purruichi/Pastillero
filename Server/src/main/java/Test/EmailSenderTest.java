package Test;

import Email.EmailSender;
import Email.EmailProperties;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

public class EmailSenderTest {

    @Test
    void testSendEmailSuccess() {
        Session mockSession = mock(Session.class);
        MimeMessage mockMessage = mock(MimeMessage.class);

        try (MockedStatic<Session> mockedSession = Mockito.mockStatic(Session.class);
             MockedStatic<Transport> mockedTransport = Mockito.mockStatic(Transport.class);
             MockedConstruction<MimeMessage> mockedMessage = Mockito.mockConstruction(MimeMessage.class,
                     (mock, context) -> {
                         // No necesitamos configurar nada aquí, solo prevenir errores
                     })) {

            // Mock Session.getInstance
            mockedSession.when(() -> Session.getInstance(any(Properties.class), any(Authenticator.class)))
                    .thenReturn(mockSession);

            // Mock Transport.send
            mockedTransport.when(() -> Transport.send(any(Message.class)))
                    .then(invocation -> null);

            String result = EmailSender.sendEmail("test@test.com");

            assertNotNull(result);
            assertEquals(6, result.length());
            assertTrue(result.matches("\\d+"));
        }
    }

    @Test
    void testSendEmailFailure() {
        Session mockSession = mock(Session.class);

        try (MockedStatic<Session> mockedSession = Mockito.mockStatic(Session.class);
             MockedStatic<Transport> mockedTransport = Mockito.mockStatic(Transport.class);
             MockedConstruction<MimeMessage> mockedMessage = Mockito.mockConstruction(MimeMessage.class)) {

            // Mock Session.getInstance
            mockedSession.when(() -> Session.getInstance(any(Properties.class), any(Authenticator.class)))
                    .thenReturn(mockSession);

            // Mock Transport.send para que lance una excepción
            mockedTransport.when(() -> Transport.send(any(Message.class)))
                    .thenThrow(new MessagingException("Send failed"));

            String result = EmailSender.sendEmail("test@test.com");

            assertNull(result);
        }
    }
}