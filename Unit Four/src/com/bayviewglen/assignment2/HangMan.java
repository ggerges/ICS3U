package com.bayviewglen.assignment2;

import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		
		String player1, player2;
		
		final String VALID_PHRASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final String VALID_GUESS_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String phrase = "";
		 
		
		
		System.out.print("Please enter Player 1's nickname: ");
		player1 = keyboard.nextLine(); 

		System.out.print("Please enter Player 2's nickname: ");
		player2 = keyboard.nextLine();
		
		boolean gameOver = false;
		boolean roundOne = true;
		
		System.out.println(player1 + " & " + player2 + " welcome to the game of Hangman!");
		int p1RoundScore = 0;
		int p2RoundScore = 0;
		
		int p1Score = 0;
		int p2Score = 0;
		
		while(!gameOver){
			
				String phraseMaker = "";
				String phraseGuesser = "";
				
				for(int turnCount = 0; turnCount < 2; turnCount++){ // when int == 0, it is player 1's turn
					
					if (turnCount == 0){
						phraseMaker = player1;
						phraseGuesser = player2;
					} else{
						phraseMaker = player2;
						phraseGuesser = player1;
					} 
					
	
					boolean invalidPhrase = false;
			
					
				System.out.println(player1 + ", please enter a Phrase or Word for "+ player2 + " to guess:");
				
					while (!invalidPhrase){
						
						phrase = keyboard.nextLine().toUpperCase();
						invalidPhrase = true;
						for (int charCheck=0; charCheck < phrase.length(); charCheck++){
							if(VALID_PHRASE_CHARACTERS.indexOf(phrase.charAt(charCheck)) == -1 ){ 
								// for loop to loop through all char of phrase and check against VALID_PHRASE_CHARACTERS using indexOf
								// if -1 invalidPhrase = true
								System.out.println("Please use only Alphanumeric Characters");
								invalidPhrase = false;					
								}
					
						}
					}
					int spaces = 0;
					while(spaces<30){
						System.out.println();
					spaces++;
				}
					boolean roundOver = false;
					
					
					
					while(!roundOver){
						String guessingPhrase = " ";
						for(int charReplace = 0; charReplace < phrase.length(); charReplace++){
							if (phrase.charAt(charReplace) != ' '){
								guessingPhrase += "_";
							}else{
								guessingPhrase += "/";
							}
						}
						System.out.println(guessingPhrase);
					
						boolean guessingChoice = true;
					
						while(guessingChoice){
								System.out.println("Please select (1) to guess the phrase, or (2) to guess a character");
								int choice = keyboard.nextInt();
					
								if (choice == 1){
						guessingChoice = false;
								} else if(choice == 2){
						guessingChoice = false;
								}	
								
			
			
			/*
				String nonGuessedCharaceters = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9 ";
				int index = nonGuessedCharaceters.indexOf('h'); // INdex of takes the letter and converts it into a nunber , so use user input
				String temp = "";
				
				for (int i=0;i<nonGuessedCharaceters.length(); i++){
					if (i ==  index)
						temp += "_ ";
					else 
						temp += nonGuessedCharaceters.charAt(index) + " ";
				}
				nonGuessedCharaceters = temp;
				*/
				
					
				}
				
				// we now have a valid phrase
				
				// start the guessing
			
				}
			}
		}
	}

