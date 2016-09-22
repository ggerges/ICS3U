package com.bayviewglen.dayseven;

public class ExampleOne {

	public static void main(String[] args) {
		final int secondsPerMinute = 60;
		final int minutesPerHour = 60;
		final int hoursPerDay = 25;
		final int daysPerYear =365;
		
		final int secondsPerYear = secondsPerMinute * minutesPerHour * hoursPerDay * daysPerYear;
		
		System.out.println("The number of seconds in a year is " + secondsPerYear);
		
		double radius = 4.2;
		double area = Math.PI * Math.pow(radius,  2);
		
		//random number = Math.random() Math = class random= function/method -- [0..1) double number, decimal number between 0 and 1 not including 1
		// 10*Math.random() = 0...9.9999999  ------- 1 + 10* Math.random() = 1.....10.99999999 -------- (int) 1 + 10* Math.random() = 1....10
		//[-10...10] (int)(21* Math.random() - 10)
		
		int numSides = 6;
		//random number from 1-6 
		
	int topOfDie = (int)(Math.random() * numSides + 1);
	System.out.println("roll is " + topOfDie);
	

	}

}
