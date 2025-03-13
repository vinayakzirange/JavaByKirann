package com.control;

import java.util.Scanner;

public class nation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of a nation:");
		String nation = scanner.nextLine();

		switch (nation) {
		case "india":
			System.out.println("The capital of India is New Delhi.");
			break;
		case "united states":
			System.out.println("The capital of the United States is Washington, D.C.");
			break;
		case "japan":
			System.out.println("The capital of Japan is Tokyo.");
			break;

		case "china":
			System.out.println("The capital of China is Beijing.");
			break;
		default:
			System.out.println("Sorry, I don't have information on that nation.");
		}
	}
}
