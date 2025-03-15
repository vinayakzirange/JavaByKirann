package com.codingExercise;

import java.util.Scanner;

public class NearestMultiple5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = scanner.nextInt();
		int output;
		if (input % 5 == 0) {
			output = input;
		} else {
			output = input - (input % 5);
		}
		System.out.println("Output: " + output);

		scanner.close();
	}
}
