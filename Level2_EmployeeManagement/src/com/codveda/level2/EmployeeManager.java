package com.codveda.level2;

import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<>();

    // Add employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    // View employees
    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("No employees available.");
            return;
        }

        System.out.println("\n---- Employee List ----");

        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    // Update employee
    public void updateEmployee(int id, String newName, double newSalary) {

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setSalary(newSalary);
                System.out.println("Employee updated successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    // Delete employee
    public void deleteEmployee(int id) {

        Employee foundEmployee = null;

        for (Employee emp : employees) {

            if (emp.getId() == id) {
                foundEmployee = emp;
                break;
            }
        }

        if (foundEmployee != null) {
            employees.remove(foundEmployee);
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}