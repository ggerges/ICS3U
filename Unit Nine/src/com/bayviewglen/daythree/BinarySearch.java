package com.bayviewglen.daythree;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		// Requires array to be sorted
		
		int[] arr = {-3,2,7,11,14,23,37,64,81,93};
		
		//search for 2
		//start from low (0) to high (9) checks mid (low + high) /2 which is index 4 (14) ,is 2 (> || < than 14?)
		// searches 0-3 , mid -1 then checks index 3/2 (index 1) is it 2? yes done
		//when low is bigger than high the number isn't there
		
	}
	//storing the reference to the array
	public static int binarySearch(int []arr, int search, int low, int high){
		int mid = (low + high) /2;
		
		if(low>high){
			return -1;
		}else if(arr[mid] == search){
			return mid;
		}else if(search < arr[mid]){
			return binarySearch(arr,search,low,mid-1);
		}else{
			return binarySearch(arr,search,mid+1,high);
		}
	}

}
