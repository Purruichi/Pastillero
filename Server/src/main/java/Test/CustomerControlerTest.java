package Test;

import Controler.CustomerControler;
import Domain.Customer;
import Database.DatabaseFunctions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class CustomerControlerTest {

    private HashMap<String, String> mockUserData;

    @BeforeEach
    void setUp() {
        mockUserData = new HashMap<>();
        mockUserData.put("id", "1");
        mockUserData.put("username", "testUser");
        mockUserData.put("password", "testPass");
        mockUserData.put("email", "test@test.com");
    }

    @Test
    void testGetCustomerByColumnValue() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            ArrayList<HashMap<String, String>> mockResult = new ArrayList<>();
            mockResult.add(mockUserData);

            mockedStatic.when(() -> DatabaseFunctions.SELECT("users", new String[0], "email", "test@test.com"))
                    .thenReturn(mockResult);

            Customer customer = CustomerControler.getCustomer("email", "test@test.com");

            assertNotNull(customer);
            assertEquals("1", customer.getId());
            assertEquals("testUser", customer.getName());
            assertEquals("test@test.com", customer.getEmail());
        }
    }

    @Test
    void testCheckLogInSuccess() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            ArrayList<HashMap<String, String>> mockResult = new ArrayList<>();
            mockResult.add(mockUserData);

            mockedStatic.when(() -> DatabaseFunctions.SELECT("users", new String[0], "username", "testUser"))
                    .thenReturn(mockResult);

            HashMap<String, String> result = CustomerControler.checkLogIn("testUser", "testPass");

            assertNotNull(result);
            assertFalse(result.isEmpty());
            assertNull(result.get("password")); // Password should be removed from result
        }
    }

    @Test
    void testSignUpUser() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            String[] testValues = {"1", "testUser", "testPass", "test@test.com"};

            // Usar doNothing() para método void
            mockedStatic.when(() -> DatabaseFunctions.INSERT(any(), any()))
                    .then(invocation -> {
                        // No hacer nada, simular éxito
                        return null;
                    });

            boolean result = CustomerControler.signUpUser(testValues);

            assertTrue(result);
        }
    }

    @Test
    void testSignUpUserFailure() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            String[] testValues = {"1", "testUser", "testPass", "test@test.com"};

            // Simular una excepción
            mockedStatic.when(() -> DatabaseFunctions.INSERT(any(), any()))
                    .thenThrow(new RuntimeException("Database error"));

            boolean result = CustomerControler.signUpUser(testValues);

            assertFalse(result);
        }
    }

    @Test
    void testDeleteUser() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            // Usar doNothing() para método void
            mockedStatic.when(() -> DatabaseFunctions.DELETE(any(), any(), any()))
                    .then(invocation -> {
                        // No hacer nada, simular éxito
                        return null;
                    });

            boolean result = CustomerControler.deleteUser("1");

            assertTrue(result);
        }
    }

    @Test
    void testDeleteUserFailure() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            // Simular una excepción
            mockedStatic.when(() -> DatabaseFunctions.DELETE(any(), any(), any()))
                    .thenThrow(new RuntimeException("Database error"));

            boolean result = CustomerControler.deleteUser("1");

            assertFalse(result);
        }
    }
}