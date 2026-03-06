package com.codveda.level1;

public class FactorialCalculator {

    public long factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public void showSteps(int n) {

        System.out.print("Factorial Expansion: ");

        for (int i = n; i >= 1; i--) {

            System.out.print(i);

            if (i != 1) {
                System.out.print(" × ");
            }
        }

        System.out.println();
    }
}