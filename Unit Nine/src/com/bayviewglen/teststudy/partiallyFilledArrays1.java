package com.bayviewglen.teststudy;

public class partiallyFilledArrays1 {

	public static void main(String[] args) {
		
	}
	
	
	
	//remove at index, order does not matter
	public static int remove(int[] data, int manyItems, int index){
		
		if(index >= manyItems || index <0){
			return -1;
		}if(manyItems>data.length){
			return -1;
		}
		
		data[index] = data[manyItems-1];
		manyItems--;
		
		return manyItems;
	}
	
	
	//insert at index, order does not matter
	
	public static int add(int[] data, int manyItems, int value){
		
		if(manyItems>=data.length){
			return -1;
		}
		data[manyItems] = value;
		manyItems ++;
		
		return manyItems;
	}
	
	
	//remove at index with order
	public static int removeOrdered(int[]data, int manyItems, int index){
		if(index >= manyItems || index<0){
			return -1;
		}
		if(manyItems > data.length){
			return -1;
		}
		
		for(int i=index; i<manyItems-1; i++){
			data[i]=data[i + 1];
		}
		manyItems --;
		
		return manyItems;
		
	}
	
	//adds at index with order
	
	public static int addOrdered(int[]data, int manyItems, int value, int index){
		
		if(index>manyItems || index < 0){
			return -1;
		}
		
		
		if(manyItems > data.length){
			return -1;
		}
		for(int i= manyItems; i>index; i--){
			
			data[i] = data[i-1];
			
		}
		data[index] = value;
		manyItems++;
		return manyItems;
	}
	
}


