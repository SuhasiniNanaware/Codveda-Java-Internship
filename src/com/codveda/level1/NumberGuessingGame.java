package com.codveda.level1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    private final Scanner scanner;
    private final Random random;
    private final int maxAttempts = 7;

    public NumberGuessingGame() {
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void startGame() {
        System.out.println("====================================");
        System.out.println("      Number Guessing Game");
        System.out.println("====================================");

        boolean playAgain = true;

        while (playAgain) {
            int maxNumber = selectDifficulty();
            int targetNumber = random.nextInt(maxNumber) + 1;

            playRound(targetNumber);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = scanner.next();
            playAgain = choice.equalsIgnoreCase("yes");
        }

        System.out.println("\nThank you for playing!");
        scanner.close();
    }

    private int selectDifficulty() {
        System.out.println("\nSelect Difficulty Level:");
        System.out.println("1. Easy (1-50)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-200)");
        System.out.print("Enter your choice: ");

        int level;

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number (1-3).");
            scanner.next();
            System.out.print("Enter your choice: ");
        }

        level = scanner.nextInt();

        switch (level) {
            case 1:
                return 50;
            case 2:
                return 100;
            case 3:
                return 200;
            default:
                System.out.println("Invalid choice. Defaulting to Medium level.");
                return 100;
        }
    }

    private void playRound(int targetNumber) {
        boolean guessedCorrectly = false;

        System.out.println("\nYou have " + maxAttempts + " attempts to guess the number!");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.print("Attempt " + attempt + ": Enter your guess: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
                System.out.print("Enter your guess: ");
            }

            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                int score = (maxAttempts - attempt + 1) * 10;
                System.out.println("\nCorrect! You guessed the number in " + attempt + " attempts.");
                System.out.println("Your Score: " + score);
                guessedCorrectly = true;
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("\nGame Over! The correct number was: " + targetNumber);
        }
    }
}