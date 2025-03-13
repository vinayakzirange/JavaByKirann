package com.extra;
//Divisible by 3 and 5
public class Que5 {
	public static void main(String[] args) {
//		int count=0;
		for(int i=451;i<=541;i++) {
			if (i%3==0 && i%5==0) {
//				count++;
				System.out.println(i);
			}
		}
	}
}
