import java.util.Scanner;

import dev.grigory.imc.BMI.BMICalculator;

public class BMICalculatorApp {
    public static void main(String[] args) {
        processBMI();
    }

    public static String processBMI() {
        Scanner scanner = new Scanner(System.in);
        String result;

        try {
            System.out.print("Enter your weight (kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your height (m): ");
            double height = scanner.nextDouble();

            double bmi = BMICalculator.calculateBMI(weight, height);
            String category = BMICalculator.getBMICategory(bmi);

            result = String.format("Your BMI: %.2f, Category: %s", bmi, category);
            System.out.println(result);
        } catch (Exception e) {
            result = "Invalid input. Please enter valid numbers.";
            System.out.println(result);
        } finally {
            scanner.close();
        }

        return result;
    }
}
