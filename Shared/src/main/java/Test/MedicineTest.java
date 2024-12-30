package Test;

import Domain.Medicine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedicineTest {

    @Test
    void testEmptyConstructor() {
        Medicine medicine = new Medicine();
        assertNull(medicine.getName());
        assertNull(medicine.getDose());
        assertEquals(0, medicine.getId());
        assertEquals(0, medicine.getFrequency());
        assertEquals(0, medicine.getRemaining());
    }

    @Test
    void testParameterizedConstructor() {
        Medicine medicine = new Medicine("Aspirin", "100mg", 1, 8, 30);

        assertEquals("Aspirin", medicine.getName());
        assertEquals("100mg", medicine.getDose());
        assertEquals(1, medicine.getId());
        assertEquals(8, medicine.getFrequency());
        assertEquals(30, medicine.getRemaining());
    }

    @Test
    void testSetters() {
        Medicine medicine = new Medicine();

        medicine.setName("Paracetamol");
        medicine.setDose("500mg");
        medicine.setId(2);
        medicine.setFrequency(6);
        medicine.setRemaining(20);

        assertEquals("Paracetamol", medicine.getName());
        assertEquals("500mg", medicine.getDose());
        assertEquals(2, medicine.getId());
        assertEquals(6, medicine.getFrequency());
        assertEquals(20, medicine.getRemaining());
    }
}
