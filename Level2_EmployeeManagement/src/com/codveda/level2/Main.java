package com.codveda.level2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        int choice;

        do {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();

                    manager.addEmployee(new Employee(id, name, salary));
                    break;

                case 2:

                    manager.viewEmployees();
                    break;

                case 3:

                    System.out.print("Enter Employee ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();

                    manager.updateEmployee(updateId, newName, newSalary);
                    break;

                case 4:

                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();

                    manager.deleteEmployee(deleteId);
                    break;

                case 5:

                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}