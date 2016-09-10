package com.bayviewglen.daythree;

public class HomeworkFive {

	public static void main(String[] args) {
		int pennies, nickels, dimes, quarters, loonies, toonies;
		double total = 0;
		pennies = 20;
		nickels = 15;
		dimes = 40;
		quarters = 30;
		loonies = 4;
		toonies = 9;
		
		total = 0.01 * pennies + 0.05 * nickels + 0.25 * quarters + 1.00 * loonies + 2.00 * toonies;
		System.out.println("Your total balance is = $" + total);
	}

}
