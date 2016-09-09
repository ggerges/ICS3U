/*
 * Used Variables, assignment operator, string concatenation, 
 * primitive data types (int and double) but are example used only int
 */

package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		// a series of characters strung together are referred to as a "String"
		// This is the stuff in Quotes "Hello"
		
		// int ----> integer | double ---> decimal numbers
		// declare 3 integers
				int numberOne, numberTwo;		// notice the naming convention for variables (camelCase)
				int sum;
			numberOne = 7;		// numberOne is assigned 7
			// 8 = numberOne;	left-hand side of an assignment must be a variable  *** error ***
			numberTwo = 12;
				
			sum = numberOne + numberTwo;
				
			System.out.println(sum);	// displays the value stored in the variable sum
			
			System.out.println(numberOne + "+" + numberTwo + "=" + sum);	// using string concatenation
			
			System.out.println(numberTwo  +  + numberOne + "+" + numberTwo + "=" + sum);	// using string concatenation
			// "19+12=19"
			

	}

}
