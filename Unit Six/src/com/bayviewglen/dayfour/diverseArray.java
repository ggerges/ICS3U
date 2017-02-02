package com.bayviewglen.dayfour;

public class diverseArray {

	static int[] arr = {1,2,3,4,5,6,9};
	
	static int[][] arr2D = {
			{1,2,3,4,8},
			{1,3},
			{10,23,-1,23,56}
	};
	
	public static void main(String[] args) {
		
		int sum = arraySum(arr);
		System.out.println("The sum is : " + sum);
		
		int[] sum2D = rowSums(arr2D);
		
		System.out.println("The sum of the 2D array is " + sum2D);
		
		System.out.println(isDiverse(arr2D));
		

	}
	private static char[] isDiverse(int[][] rogueTwo) {
		boolean diverse= true;
		
		return null;
		}
		
		
		
	
	//returns sum-----------------------------------
	public static int arraySum(int [] arr){
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
		
	}
	//----------------------------------------------
	
	public static int [] rowSums(int [][] rougueOne){
		
		int[] sums = new int[rougueOne.length];
		
		for(int i = 0; i<rougueOne.length; i++){
			sums[i] = arraySum(rougueOne[i]);
		}
		
		return sums;
	}
	
	

}
