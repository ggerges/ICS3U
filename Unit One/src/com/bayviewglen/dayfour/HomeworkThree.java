package com.bayviewglen.dayfour;

public class HomeworkThree {

	public static void main(String[] args) {
		int num = 283741;
		int digit2 = num / 10000 % 10;
		int digit5 = num / 10 % 10;
		int product = digit2 * digit5;
		
		System.out.println("The product of " + digit2 + " and " + digit5 + " is " + product + ".");

	}

}
