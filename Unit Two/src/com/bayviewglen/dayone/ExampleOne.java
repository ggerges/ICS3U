package com.bayviewglen.dayone;
// a string is a sequence of characters
// asccii table ----> C = character
//String = declares a string, String is a Class
//First character uses index 0



public class ExampleOne {

	public static void main(String[] args) {
		
		String word = "alphabet"; // Reference address is in the box
		
		String word2 = word; //Reference address to "Alphabet"
		String word3 = "alphabet";
		
		int x = 7;  /// Primitive data, Primitive = the box holds the value

		word.length(); //takes the amount of characters returns an int. length - 1 is the last index
		
		//to see if two strings are equal, use ==
		//word == word2 is true
		//word.equals(word2) is true
		//word == word3 is false
		//word.equals(word3) is true
		//boolean = true or false
		//word.charAt(6) returns the character in the 6 index charAt thats a char from a particular index
		//word.charAt(word.length()-1) gives last character
		//word.charAt(word.legnth()/2) gives middle character 
		//word.indexOf('b') returns 5
		//word.indexOf('pha') returns 
		//indexOf looks for indexes with characters
		//word.indexOf('Pha') will return -1
		//single quotes Char , double quotes for strings
		//word.substring (1,4) -- > returns characters in 1-4 but not including 4
		//word.substring (2,word.length()) 2 to last character
		//word.substring(2) give 2 to the end
		//keyboard.nextLine() grabs the whole line
	}

}
