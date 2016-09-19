package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int x, digit2, digit4, product;
		System.out.print("Please enter a 5 digit number:");
		x = keyboard.nextInt();
		digit2 = x / 1000 % 10;
		digit4 = x / 10 % 10;
		product = digit2 * digit4;
		System.out.print("The product of " + digit2 + " and " + digit4 + " is " + product + ". ");
		keyboard.close();
		

	}

}
