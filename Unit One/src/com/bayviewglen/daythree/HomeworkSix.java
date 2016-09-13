package com.bayviewglen.daythree;

public class HomeworkSix {

	public static void main(String[] args) {
double a = 8.6, b = 82.1, c = -3.9;
		
		double root1, root2;
		
		root1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
		root2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
		
		System.out.println("The roots are: " + root1 + " and " + root2);

	}

}
