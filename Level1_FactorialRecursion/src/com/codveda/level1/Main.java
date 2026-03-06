package com.codveda.level1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FactorialCalculator calculator = new FactorialCalculator();

        System.out.println("=== Recursive Factorial Calculator ===");

        while (true) {

            System.out.print("\nEnter a number: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next();
                continue;
            }

            int number = scanner.nextInt();

            try {

                calculator.showSteps(number);

                long result = calculator.factorial(number);

                System.out.println("Factorial of " + number + " = " + result);

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }

            System.out.print("\nCalculate another factorial? (yes/no): ");

            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();

        System.out.println("Program ended.");
    }
}