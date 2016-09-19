package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double x, y;
		System.out.print("Please type in a number : ");
		x = keyboard.nextDouble();
		y = x*x;
		System.out.print("The number you chose was : " + x + ". The square of it is : " + y + ". ");
		keyboard.close();

	}

}
