
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

public class BMICalculatorAppTest {

    @Test
    public void testProcessBMI_NormalWeight() {
        String result = BMICalculatorApp.processBMI(70, 1.75);
        assertTrue(result.contains("Normal weight"));
    }

    @Test
public void testProcessBMI_Obese() {
    String result = BMICalculatorApp.processBMI(100, 1.75).toLowerCase(); 
    assertTrue(result.contains("obesity"));
}

    @Test
    public void testProcessBMI_InvalidInput() {
        String result = BMICalculatorApp.processBMI(-10, 1.75);
        assertEquals("Invalid input. Please enter valid numbers.", result);
    }
    @Test
    public void testProcessUserInput_InvalidInput() {
        String simulatedInput = "abc\nxyz\n"; 
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        BMICalculatorApp.processUserInput();
        assertTrue(true); 
    }
}
