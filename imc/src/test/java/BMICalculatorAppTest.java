
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorAppTest {

    @Test
    public void testProcessBMI_NormalCase() {
        String result = BMICalculatorApp.processBMI(75, 1.75);
        assertTrue(result.contains("Your BMI: 24.49"));
        assertTrue(result.contains("Category: Normal weight"));
    }

    @Test
    public void testProcessBMI_Underweight() {
        String result = BMICalculatorApp.processBMI(50, 1.75);
        assertTrue(result.contains("Category: Mild Thinness"));
    }

    @Test
    public void testProcessBMI_Obese() {
        String result = BMICalculatorApp.processBMI(100, 1.75);
        assertTrue(result.contains("Category: Obesity class II"));
    }

    @Test
    public void testProcessBMI_InvalidInput() {
        String result = BMICalculatorApp.processBMI(-10, 1.75);
        assertEquals("Invalid input. Please enter valid numbers.", result);
    }
}
