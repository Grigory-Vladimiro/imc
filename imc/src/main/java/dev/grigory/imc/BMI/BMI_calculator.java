package dev.grigory.imc.BMI;

public class BMI_calculator {
    public static double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than zero.");
        }
        return weight / (height * height);
    }
public static String getBMICategory(double bmi) {
    if (bmi < 16) {
        return "Severe Thinness";
    } else if (bmi < 17) {
        return "Moderate Thinness";
    } else if (bmi < 18.5) {
        return "Mild Thinness";
    } else if (bmi < 25) {
        return "Normal weight";
    } else if (bmi < 30) {
        return "Overweight";
    } else if (bmi < 35) {
        return "Obesity class I";
    } else if (bmi < 40) {
        return "Obesity class II";
    } else {
        return "Obesity class III";
    }
}
}