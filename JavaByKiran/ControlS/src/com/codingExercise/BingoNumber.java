package com.codingExercise;
import java.util.Scanner;
public class BingoNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	     int number = scanner.nextInt();
        boolean isDivisible = number % 7 == 0;
        boolean containsSeven = false;
        int temp = Math.abs(number); 
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 7) {
                containsSeven = true;
                break;
            }
            temp = temp / 10;
        }
        if (isDivisible && !containsSeven) {
            System.out.println("Bingo Number");
        } else {
            System.out.println("Not A Bingo Number");
        }
        scanner.close();
	    }
	}

