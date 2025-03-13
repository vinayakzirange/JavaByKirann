package com.control;

import java.util.Scanner;

public class ladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");

		int marks = 70;
		if (marks >= 75) {
			System.out.println("A1 Grade");
		} else if (marks >= 65 && marks < 75) {
			System.out.println("A2 Grade");
		} else if (marks >= 55 && marks < 65) {
			System.out.println("B1 Grade");
		} else if (marks >= 55 && marks < 55) {
			System.out.println("B2 Grade");
		} else {
			System.out.println("C Grade");
		}
	}
}
