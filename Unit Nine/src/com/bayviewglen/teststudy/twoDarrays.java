package com.bayviewglen.teststudy;


public class twoDarrays {

	public static String sSearch(int[]x, int key) {
		String y = "";
		boolean z = false;
		for(int i=0; i<x.length;i++){
			if(x[i]== key){
				y+=i+" ";
				z = true;
			}
		}
if(!z){
	y = "key was not found";
}
return y;
	}
	
	public static void testMethod(){
		int[] y = new int[12];
		for(int i =0; i<y.length; i++){
			y[i] = 5*(i/4);
			
			System.out.println(sSearch(y,5));
		}
	}
	
	
	public static void main(String[] args) {
		
	
	//Declare an array
	
	int[][] arr = {
			{1,2,3,4},
			{10,28,9,0},
			{37,23,2,2},
			{2,45,7,4}
			
	};
	
	int[][] arr1 = {
			{0,1,2,3,4},
			{0,1,2,3},
			{0,1,2},
			{0,1}
			};
	
	
	//Traverse through a 2D array that IS rectangular 
	
	for(int row =0; row<arr.length; row++){
		System.out.println("");
		for(int column=0; column<arr[0].length;column++){
			System.out.print(" " +arr[row][column]);
		}
	}
	
	
	System.out.println(" \n");
	
	//Traverse a 2D array that is not REctangular
	for(int row =0; row<arr1.length; row++){
		System.out.println("");
		for(int column=0; column<arr1[row].length;column++){
			System.out.print(" " +arr1[row][column]);
		}
	}
	
	// Sum up all the rows in a 2D array
	int rowSum = 0;
	
	for(int row =0; row<arr.length; row++){
		rowSum = 0;
		System.out.println("\n ");
		for(int column=0; column<arr[0].length;column++){
			rowSum += arr[row][column];
			
		}
		System.out.print("Row sum of row " + row + " : " + rowSum);
	}
	
	System.out.println("The sum of the rows in arr1 is: " + rowSum);
	
	//Sum up all the columns in a 2D array
	
	int columnSum = 0;
	for(int column = 0; column<arr[0].length; column++){
		columnSum = 0;
		for(int row = 0; row<arr.length; row++){
			columnSum += arr[row][column];
		}
		System.out.print("Col sum of Col " + column + " : " + columnSum);
	}
	
	System.out.println("The sum of the columns in arr1 is: " + columnSum);
	
	// Find min/max of a 2D array
	int lowest = arr[0][0];
	int highest = arr[0][0];
	
	for(int row =0; row<arr.length; row++){
	
		System.out.println("");
		for(int column=0; column<arr[0].length;column++){
			if (arr[row][column] > highest){
				highest = arr[row][column];
			} 
			if (arr[row][column] < lowest){
				lowest = arr[row][column];
			}
		}
	}
	System.out.println("Lowest : " +lowest + ", Highest : " + highest);
	
	
	//Add up diagonal elements in a 2D array that is rectangular
	int diagonalSum = 0;
	
	for(int row =0; row<arr.length; row++){
		System.out.println("");
		for(int column=0; column<arr[0].length;column++){
			if(row == 0){
				diagonalSum += arr[row][column];
				break;
			}else if(column == arr[0].length -1 ){
				break;
			}
			else{
				diagonalSum += arr[row][column+row];
				break;
			}

		}
		
	}
	System.out.println("The sum of the diagonal ints is :"  + diagonalSum);
	
}
}

