package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the width of the rectangle :");
		double width = keyboard.nextDouble();
		System.out.print("Please enter the legnth of the rectangle :");
		double legnth = keyboard.nextDouble();
		
		double area = width * legnth, 
				perimeter = (width *2) + (legnth * 2);
		
		System.out.println("The Area for the Rectangle is " + area + " and the Perimeter for the Rectangle is " + perimeter );
			keyboard.close();
	}

}
