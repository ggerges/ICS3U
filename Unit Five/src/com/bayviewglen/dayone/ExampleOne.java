package com.bayviewglen.dayone;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		int x  = 25;
		
		int y = sum(x);
		System.out.println(y);
		
		int z = 3;
		System.out.println(cube(z));
		
		//String goodString = getAlphanumericString();
		
		//System.out.println("The good string is :" + goodString);
		
		int n =11;
		System.out.println("You rolled a " + roll(n));
		
	}
	
	public static int roll(int numSides){
		
		if(numSides < 3){
			throw new IllegalArgumentException("Number of sides must be at least 3 stupid");
		}
		
		
		int top = (int)(Math.random() * numSides + 1);
		
		return top;
	}
		
	
	public static String getAlphanumericString() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a sentence:");
		String validChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		String sentence = "";
		boolean isValid = false;
		while(!isValid){
			sentence = keyboard.nextLine().toUpperCase();
			isValid = true;
			for(int i = 0; i < sentence.length() && isValid; i++){
				if(validChars.indexOf(sentence.charAt(i)) == -1){
					isValid = false;
				}
				if (!isValid){
					System.out.println("Type in a string..");
				}
			}
		}
		return sentence;
	}


	// outside original code
	// accepts an integer n and sums the number [1,n]
		public static int sum(int n){
			int sum = 0;
			for (int i = 0; i <= n ;i++){
				sum+=i;
			}
			return sum;
		}
		
		public static double cube(double x){
			return x * x * x;
		}
	}

