package com.bayviewglen.daytwo;

public class RecursiveProgramming {

	public static void main(String[] args) {
		int  i = fibonacci(100);
		
		System.out.print(i);
	}
	private static int factorial(int n){
		if((n==1) || (n==0)){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
/*
 * 
 * Fibinacci Squence:
 * 
 * What is the nth number in the sequence
 * 
 * 
 * 1,2,3,4,5,6,7,8,9
 * 
 * 1,1,2,3,5,8,13,21,34
 * 
*/ private static int fibonacci(int n){
	if(n == 1 || n==2){
		return 1;
	}else{
		return fibonacci(n-2) + fibonacci(n-1);
	}
}
 
}
