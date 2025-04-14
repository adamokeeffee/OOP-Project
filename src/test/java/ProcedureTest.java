import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcedureTest {

    private Procedure procedure;

    @BeforeEach
    public void setUp() {
        procedure = new Procedure(
                1,
                "X-Ray",
                "Radiographic imaging to diagnose fractures",
                75.50,
                15
        );
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals(1, procedure.getProcedureId());
        assertEquals("X-Ray", procedure.getProcedureName());
        assertEquals("Radiographic imaging to diagnose fractures", procedure.getDescription());
        assertEquals(75.50, procedure.getCost(), 0.001);
        assertEquals(15, procedure.getDurationInMinutes());
    }

    @Test
    public void testSetters() {
        procedure.setProcedureId(2);
        procedure.setProcedureName("MRI");
        procedure.setDescription("Magnetic resonance imaging");
        procedure.setCost(350.00);
        procedure.setDurationInMinutes(45);

        assertEquals(2, procedure.getProcedureId());
        assertEquals("MRI", procedure.getProcedureName());
        assertEquals("Magnetic resonance imaging", procedure.getDescription());
        assertEquals(350.00, procedure.getCost(), 0.001);
        assertEquals(45, procedure.getDurationInMinutes());
    }

    @Test
    public void testToStringContainsProcedureName() {
        String output = procedure.toString();
        assertTrue(output.contains("X-Ray"));
    }
}
