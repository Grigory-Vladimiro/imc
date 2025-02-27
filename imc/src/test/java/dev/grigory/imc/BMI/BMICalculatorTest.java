package dev.grigory.imc.BMI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {
    @Test
    public void testCalculateBMI() {
        assertEquals(20.99, BMICalculator.calculateBMI(68, 1.80), 0.01);
        assertEquals(24.49, BMICalculator.calculateBMI(75, 1.75), 0.01);
    }
    @Test
    public void testCalculateBMIInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(-70, 1.75));
    }

    @Test
    public void testGetBMICategory() {
        assertEquals("Severe Thinness", BMICalculator.getBMICategory(15.5));
        assertEquals("Normal weight", BMICalculator.getBMICategory(22.0));
        assertEquals("Obesity class III", BMICalculator.getBMICategory(45.0));
    }
    @Test
    public void testGetBMICategory_MissingRanges() {
    assertEquals("Moderate Thinness", BMICalculator.getBMICategory(16.5));  
    assertEquals("Mild Thinness", BMICalculator.getBMICategory(18.0));      
    assertEquals("Normal weight", BMICalculator.getBMICategory(24.9));      
    assertEquals("Overweight", BMICalculator.getBMICategory(29.9));         
    assertEquals("Obesity class I", BMICalculator.getBMICategory(34.9));    
    assertEquals("Obesity class II", BMICalculator.getBMICategory(39.9));   
}
}

