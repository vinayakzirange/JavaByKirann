package com.control;

import java.util.Scanner;

public class Mango {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = scanner.nextInt();

		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("Mango and Cherry");
		} else if (number % 3 == 0) {
			System.out.println("Mango");
		} else if (number % 5 == 0) {
			System.out.println("Cherry");
		}
	}
}