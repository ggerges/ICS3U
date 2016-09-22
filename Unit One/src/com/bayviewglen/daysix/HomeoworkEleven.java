package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeoworkEleven {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		double ke,mass,v;
		System.out.print("Please enter the mass of the object : ");
		mass = keyboard.nextDouble();
		System.out.print(" Please enter the Speed that the object is travelling at: ");
		v = keyboard.nextDouble();
		ke = 0.5 * mass * (v * v);
		
		System.out.println("The Kinetic Energy of the object is : " + ke );
		keyboard.close();

	}

}
