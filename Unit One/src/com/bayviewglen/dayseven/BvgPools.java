package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BvgPools {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double length,width; 
		System.out.print("Please enter the Width of the Pool : ");
		width = keyboard.nextDouble();
		System.out.print("Please enter the Length of the Pool : ");
		length = keyboard.nextDouble();
		System.out.println("---------------------------------------");
		double shallow,deep;
		System.out.print("Please enter the depth of the shallow end of the Pool : ");
		shallow = keyboard.nextDouble();
		System.out.print("Please enter the depth of the deep end of the Pool : ");
		deep = keyboard.nextDouble();
		double transition, lengthShallow, lengthDeep;
		System.out.print("Please enter the legnth of the 'Transition' between the shallow and the deep end : ");
		transition = keyboard.nextDouble();
		System.out.print("Please enter the legnth of the shallow end : ");
		lengthShallow = keyboard.nextDouble();
		lengthDeep = length - lengthShallow;
		double liner1,liner2,liner3;
		System.out.print("Please enter the price for the first liner : ");
		liner1 = keyboard.nextDouble();
		System.out.print("Please enter the price for the Second liner : ");
		liner2 = keyboard.nextDouble();
		System.out.print("Please enter the price for the Third liner : ");
		liner3 = keyboard.nextDouble();

	}

}
