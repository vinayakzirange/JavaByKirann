package com.codingExercise;
import java.util.Scanner;
public class BingoNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
  if (isDivisibleBySeven(number) && !containsSeven(number)) {
	            System.out.println("Bingo Number");
	        } else {
	            System.out.println("Not A Bingo Number");
	        }
	        scanner.close();
	    }
	    private static boolean isDivisibleBySeven(int num) {
	        return num % 7 == 0;
	    }
	    private static boolean containsSeven(int num) {
	        String numStr = Integer.toString(Math.abs(num));
	        return numStr.contains("7");
	    }
	}

