package com.ex1;

import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        Employee[] employees = new Employee[numEmployees];

        // Input employee information
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Category (A, B, C): ");
            String category = scanner.nextLine();
            System.out.print("Overtime Hours: ");
            double overtimeHours = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer

            employees[i] = new Employee(name, category, overtimeHours);
        }

        // Display salary information for all employees
        System.out.println("\n=== Employee Salary Details ===");
        for (Employee emp : employees) {
            emp.display();
        }

        scanner.close();
    }
}