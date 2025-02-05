import java.util.Scanner;

import dev.grigory.imc.BMI.BMICalculator;

public class BMICalculatorApp {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your weight (kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter your height (m): ");
            double height = scanner.nextDouble();

            double bmi = BMICalculator.calculateBMI(weight, height);
            String category = BMICalculator.getBMICategory(bmi);

            System.out.printf("Your BMI: %.2f%n", bmi);
            System.out.println("Category: " + category);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close();
        }
    }
}
