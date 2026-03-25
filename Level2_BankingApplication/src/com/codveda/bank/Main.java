package com.codveda.bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // starting balance

        int choice;

        do {

            System.out.println("\n===== Banking Application =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("❌ Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}