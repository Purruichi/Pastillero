package Test;

import Controler.MedicineControler;
import Database.DatabaseFunctions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

public class MedicineControlerTest {

    private HashMap<String, String> mockMedData;

    @BeforeEach
    void setUp() {
        mockMedData = new HashMap<>();
        mockMedData.put("id", "1");
        mockMedData.put("name", "Aspirin");
    }

    @Test
    void testGetUserMeds() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            ArrayList<HashMap<String, String>> mockResult = new ArrayList<>();
            mockResult.add(mockMedData);

            mockedStatic.when(() -> DatabaseFunctions.SELECT("user_meds", new String[0], "user_id", "1"))
                    .thenReturn(mockResult);

            ArrayList<HashMap<String, String>> result = MedicineControler.getUserMeds("1");

            assertNotNull(result);
            assertFalse(result.isEmpty());
            assertEquals("Aspirin", result.get(0).get("name"));
        }
    }

    @Test
    void testGetMedicineName() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            ArrayList<HashMap<String, String>> mockResult = new ArrayList<>();
            mockResult.add(mockMedData);

            mockedStatic.when(() -> DatabaseFunctions.SELECT("medicines", new String[]{"name"}, "id", "1"))
                    .thenReturn(mockResult);

            String result = MedicineControler.getMedicineName(1);

            assertEquals("Aspirin", result);
        }
    }

    @Test
    void testAddMedicine() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            // Usar doNothing() para métodos void
            mockedStatic.when(() -> DatabaseFunctions.INSERT("medicines", any()))
                    .then(invocation -> null); // Esto permite que el método void se ejecute sin error

            boolean result = MedicineControler.addMedicine("Aspirin");
            assertTrue(result);

            // Verificar que el método fue llamado con los parámetros correctos
            mockedStatic.verify(() -> DatabaseFunctions.INSERT("medicines", any()));
        }
    }
}
