package com.loop;

public class ContinueDemo2 {
	public static void main(String[] args) {
		int k =1;
		for(k=1;k<=30;k++) {
		
			if(k%3==0)
				continue;
			System.out.println(k);
		}
	}

}
