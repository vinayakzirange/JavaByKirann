package com.control;

import java.util.*;

public class User {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number:");
		double num1 = scanner.nextDouble();

		System.out.println("Enter second number:");
		double num2 = scanner.nextDouble();

		System.out.println("Choose an operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Result: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Result: " + (num1 - num2));
			break;
		case 3:
			System.out.println("Result: " + (num1 * num2));
			break;
		case 4:
			if (num2 != 0) {
				System.out.println("Result: " + (num1 / num2));
			} else {
				System.out.println("Division by zero is not allowed.");
			}
			break;
		case 5:
			if (num2 != 0) {
				System.out.println("Result: " + (num1 % num2));
			} else {
				System.out.println("Division by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Invalid choice.");
			break;

		}

	}
}
