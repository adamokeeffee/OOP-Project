import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PharmacyTest {

    private Pharmacy pharmacy;

    @BeforeEach
    public void setUp() {
        pharmacy = new Pharmacy(
                1,
                101,
                "Paracetamol",
                "Painkiller",
                250,
                0.50
        );
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals(1, pharmacy.getPharmacyId());
        assertEquals(101, pharmacy.getSupplierId());
        assertEquals("Paracetamol", pharmacy.getMedicineName());
        assertEquals("Painkiller", pharmacy.getCategory());
        assertEquals(250, pharmacy.getStockQuantity());
        assertEquals(0.50, pharmacy.getPricePerUnit(), 0.001);
    }

    @Test
    public void testSetters() {
        pharmacy.setPharmacyId(2);
        pharmacy.setSupplierId(202);
        pharmacy.setMedicineName("Ibuprofen");
        pharmacy.setCategory("Anti-inflammatory");
        pharmacy.setStockQuantity(150);
        pharmacy.setPricePerUnit(0.75);

        assertEquals(2, pharmacy.getPharmacyId());
        assertEquals(202, pharmacy.getSupplierId());
        assertEquals("Ibuprofen", pharmacy.getMedicineName());
        assertEquals("Anti-inflammatory", pharmacy.getCategory());
        assertEquals(150, pharmacy.getStockQuantity());
        assertEquals(0.75, pharmacy.getPricePerUnit(), 0.001);
    }

    @Test
    public void testToStringContainsMedicineName() {
        String output = pharmacy.toString();
        assertTrue(output.contains("Paracetamol"));
    }
}
