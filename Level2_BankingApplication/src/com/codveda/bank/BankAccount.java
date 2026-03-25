package com.codveda.bank;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Amount deposited successfully.");
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawal successful.");
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
}