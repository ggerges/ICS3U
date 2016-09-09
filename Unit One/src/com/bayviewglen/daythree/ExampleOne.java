package com.bayviewglen.daythree;

public class ExampleOne {

	public static void main(String[] args) {
		// There are things that can go in the quotes that cause issues
		System.out.println("There is no issue...");
		
		// The following characters could cause an issue \, ",
		// So we can escape them using the backslash
			
		// \" is actually a single character, not two characters 
		
		System.out.println("This \"is\" important!");
		
		// \n pressed enter, same as "println", \" is also an escape
	   
		System.out.println("This\nis\nimportant!");
	
		//System.out.println("This \g is important!");		// \g is not an escape sequence
		
		System.out.println("This \\g is important!"); // double backslash escapes backslash
		
	}

}
