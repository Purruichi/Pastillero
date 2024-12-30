package Test;

import Domain.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;

public class CustomerTest {

    @Test
    void testEmptyConstructor() {
        Customer customer = new Customer();
        assertNotNull(customer.getId());
        assertNotNull(customer.getName());
        assertNotNull(customer.getEmail());
        assertTrue(customer.getId().isEmpty());
        assertTrue(customer.getName().isEmpty());
        assertTrue(customer.getEmail().isEmpty());
    }

    @Test
    void testParameterizedConstructor() {
        String id = "123";
        String name = "John Doe";
        String email = "john@example.com";

        Customer customer = new Customer(id, name, email);

        assertEquals(id, customer.getId());
        assertEquals(name, customer.getName());
        assertEquals(email, customer.getEmail());
    }

    @Test
    void testHashMapConstructor() {
        HashMap<String, String> userData = new HashMap<>();
        userData.put("id", "456");
        userData.put("username", "Jane Doe");
        userData.put("email", "jane@example.com");

        Customer customer = new Customer(userData);

        assertEquals("456", customer.getId());
        assertEquals("Jane Doe", customer.getName());
        assertEquals("jane@example.com", customer.getEmail());
    }

    @Test
    void testSetters() {
        Customer customer = new Customer();

        customer.setId("789");
        customer.setName("Alice");
        customer.setEmail("alice@example.com");

        assertEquals("789", customer.getId());
        assertEquals("Alice", customer.getName());
        assertEquals("alice@example.com", customer.getEmail());
    }
}
