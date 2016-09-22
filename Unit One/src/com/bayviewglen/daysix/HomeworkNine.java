package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		int items;
		System.out.print("Please type the amount of sales you made: ");
		items = keyboard.nextInt();
		double pay, total;
		pay = 0.27;
		total = pay * items;
		System.out.println("The total pay is $" + total);
		

	}

}
