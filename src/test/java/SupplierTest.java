import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SupplierTest {

    private Supplier supplier;

    @BeforeEach
    public void setUp() {
        supplier = new Supplier(
                1,
                10,
                "MedSupply Co.",
                "123-456-7890",
                "contact@medsupply.com",
                "123 Medical St, NY"
        );
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals(1, supplier.getSupplierId());
        assertEquals(10, supplier.getPharmacyId());
        assertEquals("MedSupply Co.", supplier.getSupplierName());
        assertEquals("123-456-7890", supplier.getPhoneNumber());
        assertEquals("contact@medsupply.com", supplier.getEmail());
        assertEquals("123 Medical St, NY", supplier.getAddress());
    }

    @Test
    public void testSetters() {
        supplier.setSupplierId(2);
        supplier.setPharmacyId(20);
        supplier.setSupplierName("PharmaLink");
        supplier.setPhoneNumber("987-654-3210");
        supplier.setEmail("info@pharmalink.com");
        supplier.setAddress("456 Health Ave, LA");

        assertEquals(2, supplier.getSupplierId());
        assertEquals(20, supplier.getPharmacyId());
        assertEquals("PharmaLink", supplier.getSupplierName());
        assertEquals("987-654-3210", supplier.getPhoneNumber());
        assertEquals("info@pharmalink.com", supplier.getEmail());
        assertEquals("456 Health Ave, LA", supplier.getAddress());
    }

    @Test
    public void testToStringContainsSupplierName() {
        String output = supplier.toString();
        assertTrue(output.contains("MedSupply Co."));
    }
}
