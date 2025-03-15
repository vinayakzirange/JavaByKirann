package com.codingExercise;

import java.util.Scanner;

public class MinNumber { 	
	public static void main(String[] args) {
		
		  

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.println("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        System.out.println("Enter the third number: ");
		        int num3 = scanner.nextInt();

		        int min;
		        if (num1 <= num2 && num1 <= num3) {
		            min = num1;
		        } else if (num2 <= num1 && num2 <= num3) {
		            min = num2;
		        } else {
		            min = num3;
		        }

		        System.out.println("The minimum number is: " + min);

		        
		        scanner.close();
		    }
		

	}


