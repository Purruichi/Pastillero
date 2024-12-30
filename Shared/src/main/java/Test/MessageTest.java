package Test;


import Domain.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;

public class MessageTest {

    @Test
    void testEmptyConstructor() {
        Message message = new Message();
        assertNotNull(message.getContext());
        assertNotNull(message.getSession());
        assertTrue(message.getContext().isEmpty());
        assertTrue(message.getSession().isEmpty());
    }

    @Test
    void testSetters() {
        Message message = new Message();
        String context = "Test Context";
        HashMap<String, Object> session = new HashMap<>();
        session.put("key1", "value1");
        session.put("key2", 123);

        message.setContext(context);
        message.setSession(session);

        assertEquals(context, message.getContext());
        assertEquals(session, message.getSession());
        assertEquals("value1", message.getSession().get("key1"));
        assertEquals(123, message.getSession().get("key2"));
    }

    @Test
    void testSerializable() {
        Message message = new Message();
        assertTrue(message instanceof java.io.Serializable);
    }
}
