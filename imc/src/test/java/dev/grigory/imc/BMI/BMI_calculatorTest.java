package dev.grigory.imc.BMI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BMI_calculatorTest {
    @Test
    public void testCalculateBMI() {
        assertEquals(20.76, BMICalculator.calculateBMI(68, 1.80), 0.01);
        assertEquals(24.22, BMICalculator.calculateBMI(75, 1.75), 0.01);
    }
}
