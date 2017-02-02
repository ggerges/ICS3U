package com.baviewglen.daythree;

public class PartiallyFilledArrayExample {
	static int[] data = new int[10];
	static int howMany = 0;

	public static void main(String[] args) {
		
		display();
		add(7);
		add(6);
		add(2);
		add(10);
		add(8);
		
		display();
		
		deleteAtIndex(2);
		display();
		
		deleteAtIndex(1);
		display();
		
		insert(3,5);
		display();
		insert(9,2);
		display();
		insert(-5,1);
		display();
	}
	
	private static void insert(int value, int index) {
		for( int i = howMany; i > 1; i--){
			data[i] = data [ i-1 ];
		}
		data[index] = value;
		howMany ++;
		
	}

	private static void deleteAtIndex(int index) {
		for(int i = index; i<howMany-1; i++){
			data[i] = data[i+1];
		}
		howMany --;
		
	}

	private static void add(int value) {
		
		data[howMany++] = value;
		
	}

	private static void display(){
		System.out.println("The partially filled array with " + howMany + " elements; ");
		for( int i = 0; i<howMany; i++){
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.println();
	}
	

}
