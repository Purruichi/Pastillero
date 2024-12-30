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
import static org.mockito.ArgumentMatchers.eq;

public class MedicineControlerTest {
    private HashMap<String, String> mockMedData;

    @BeforeEach
    void setUp() {
        mockMedData = new HashMap<>();
        mockMedData.put("id", "1");
        mockMedData.put("name", "Ibuprofeno");
        mockMedData.put("advised_dose", "80");
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
            assertEquals("Ibuprofeno", result.get(0).get("name"));
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
            assertEquals("Ibuprofeno", result);
        }
    }

    @Test
    void testAddMedicine() {
        try (MockedStatic<DatabaseFunctions> mockedStatic = Mockito.mockStatic(DatabaseFunctions.class)) {
            // Usar eq() para el primer parámetro y any() para el segundo
            mockedStatic.when(() -> DatabaseFunctions.INSERT(eq("medicines"), any(String[].class)))
                    .then(invocation -> {
                        return null;
                    });

            boolean result = MedicineControler.addMedicine("Ibuprofeno");
            assertTrue(result);

            // Verificar que el método fue llamado con los parámetros correctos
            mockedStatic.verify(() -> DatabaseFunctions.INSERT(eq("medicines"), any(String[].class)));
        }
    }
}