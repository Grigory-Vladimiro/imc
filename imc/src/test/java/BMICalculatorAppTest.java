import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import dev.grigory.imc.BMI.BMICalculator;

public class BMICalculatorAppTest {
    @Test
    public void testCalculateBMI_NormalCase() {
        assertEquals(24.49, BMICalculator.calculateBMI(75, 1.75), 0.01);
    }

    @Test
    public void testCalculateBMI_Obese() {
        assertEquals(32.68, BMICalculator.calculateBMI(100, 1.75), 0.01);
    }

    @Test
    public void testCalculateBMI_InvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(-10, 1.75));
    }

    @Test
    public void testGetBMICategory_Normal() {
        assertEquals("Normal weight", BMICalculator.getBMICategory(22.0));
    }

    @Test
    public void testGetBMICategory_Obesity() {
        assertEquals("Obesity class II", BMICalculator.getBMICategory(37.0));
    }
}
