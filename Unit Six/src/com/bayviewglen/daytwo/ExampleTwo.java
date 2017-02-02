package com.bayviewglen.daytwo;

public class ExampleTwo {

	public static void main(String[] args) {
		String [] arr = {"Hello", "Hi", "Bye", "Sorry", "ICS3U", "Bubble Gum", "Bees"};
		int howMany = howManyEs(arr);
		System.out.println(howMany);
	}

	private static int howManyEs(String[] words) {
		int numEs = 0;
		
		for (int i= 0; i<words.length; i++){
			String word = words[i].toUpperCase();
			
			for(int j = 0; j< word.length(); j++){
				if (word.charAt(j) == 'E')
					numEs++;
			}
		}

		return numEs;
	}

}
