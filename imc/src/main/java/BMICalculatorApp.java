
import dev.grigory.imc.BMI.BMICalculator;
import java.util.Scanner;

public class BMICalculatorApp {
    public static void main(String[] args) {
        processUserInput(); 
    }

    public static void processUserInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your weight (kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your height (m): ");
            double height = scanner.nextDouble();

            String result = processBMI(weight, height);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }

    public static String processBMI(double weight, double height) {
        try {
            double bmi = BMICalculator.calculateBMI(weight, height);
            String category = BMICalculator.getBMICategory(bmi);
            return String.format("Your BMI: %.2f, Category: %s", bmi, category);
        } catch (IllegalArgumentException e) {
            return "Invalid input. Please enter valid numbers.";
        }
    }
}
