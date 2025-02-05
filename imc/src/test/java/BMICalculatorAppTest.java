import org.junit.jupiter.api.Test;

public class BMICalculatorAppTest {
    @Test
    void testMain() {
        @Test
        public void testProcessBMI_NormalCase() {
            String result = BMICalculatorApp.processBMI();
            assertTrue(result.contains("Your BMI"));
        }
    }
}
