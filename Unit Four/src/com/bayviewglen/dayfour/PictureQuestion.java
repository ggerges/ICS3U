package com.bayviewglen.dayfour;

public class PictureQuestion {

	public static void main(String[] args) {
		String word = "CANADA";
		
		//top
		System.out.println("*" + word + "*");
		
		//second line
		for (int i=0; i<word.length(); i++){
			//a letter
			System.out.print(word.charAt(word.length()-i-1));
			
				for(int j=0; j<word.length();j++){
				
					System.out.print("*");
				}	
		\	//a letter
			System.out.print(word.charAt(i));
			System.out.println();
		}
		
		
		
		
		
		//bottom
		System.out.print("*");
		for (int i =word.length()-1; i>=0; i--){
			System.out.print(word.charAt(i));
		}
		System.out.print("*");
	}

}
