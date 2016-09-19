package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		double x, y, z;
		System.out.print("Please enter what the test is out of: ");
		x = keyboard.nextDouble();
		System.out.print("Please enter your mark:");
		y = keyboard.nextDouble();
		z = y / x * 100; 
		System.out.print("Your percentage is %" + (int) z + ". ");
		keyboard.close();

	}

}
