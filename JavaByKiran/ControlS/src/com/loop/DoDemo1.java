package com.loop;

public class DoDemo1 {
	public static void main(String[] args) {
		int i = 101;
		while (i <= 145) {
			if (i % 4 == 0)
				i++;
			continue;
		}{
		System.out.println(i);
		}
	}
}
