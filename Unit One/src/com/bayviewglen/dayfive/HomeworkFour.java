package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double vi,a,t,vf;
		System.out.print("Please enter the intital Velocity the car is travelling at: ");
		vi = keyboard.nextDouble();
		System.out.print("Please enter the rate of acceleration: ");
		a = keyboard.nextDouble();
		System.out.print("Please enter the total time: ");
		t = keyboard.nextDouble();
		vf = vi + a * t;
		System.out.print("Your final Velocity is: " + vf + " m/s.");
		keyboard.close();
	}

}
