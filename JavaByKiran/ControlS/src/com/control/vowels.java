package com.control;

import java.util.Scanner;

public class vowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch = scanner.next().charAt(0);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is a vowel.");
			break;
		default:
			System.out.println(ch + " is not voewl");
		}
	}
}
