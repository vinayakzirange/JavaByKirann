package com.control;

import java.util.Scanner;

public class Divisiblity {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = scanner.nextInt();

		if (number % 4 == 0 && number % 7 == 0) {
			System.out.println("The number " + number + " is divisible by both 4 and 7.");
		} else if (number % 4 == 0) {
			System.out.println("The number " + number + " is divisible by 4.");
		} else if (number % 7 == 0) {
			System.out.println("The number " + number + " is divisible by 7.");
		} else {
			System.out.println("The number " + number + " is not divisible by 4 or 7.");
		}

		scanner.close();
	}
}
