

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * The test class GPAcalcTest.
 *
 * @author  King Sambonge
 * @version 1.0 - 01/13/2025
 */
public class GPAcalcTest{
    
    @Test
    public void testValidPercentage() {
        assertEquals(4.0, GPAcalc.calculateGPA(97.0));
        assertEquals(3.5, GPAcalc.calculateGPA(90.0));
        assertEquals(2.0, GPAcalc.calculateGPA(75.89));
    }
    
    @Test
    public void testEdgeCases() {
        assertEquals(4.0, GPAcalc.calculateGPA(100.0));
        assertEquals(1.0, GPAcalc.calculateGPA(65.0));
        assertEquals(0.0, GPAcalc.calculateGPA(0.0));
    }
    
    @Test
    public void testInvalidPercentage() {
        assertEquals(0.0, GPAcalc.calculateGPA(-5.0));
        assertEquals(0.0, GPAcalc.calculateGPA(105.0));
        assertEquals(0.0, GPAcalc.calculateGPA(64.9));
    }
}
