package Assignment_1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		 /*
         *  3. Temperature Converter
         * Problem Statement: 
         * Write a program that converts temperatures between Celsius and Fahrenheit. 
         * The user should be prompted to enter a temperature and specify the conversion direction (Celsius to Fahrenheit or Fahrenheit to Celsius).
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter...");
        System.out.println("Choose the options for conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        double inputTemperature, convertedTemperature;

        switch (choice) {
            case 1:
                // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                inputTemperature = sc.nextDouble();
                convertedTemperature = (inputTemperature * 9 / 5) + 32;
                System.out.printf("\n%.2f°C is equal to %.2f°F.\n", inputTemperature, convertedTemperature);
                break;

            case 2:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemperature = sc.nextDouble();
                convertedTemperature = (inputTemperature - 32) * 5 / 9;
                System.out.printf("\n%.2f°F is equal to %.2f°C.\n", inputTemperature, convertedTemperature);
                break;

            default:
                System.out.println("\nInvalid choice. Please run the program again and choose 1 or 2.");
                break;
        }

        // Close the scanner
        sc.close();
	}

}
