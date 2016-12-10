package com.bayviewglen.assignment2;

import java.util.Scanner;

public class HangmanFinal {

	public static void main(String[] args) {
		// Scanner
		Scanner keyboard = new Scanner(System.in);

		// declared ints
		int round = 4;
		int roundLimit = 5; //normal game
		int player1 = 0;
		int player2 = 0;
		int guessCount = 7;

		// declared Strings
		final String VALID_PHRASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
		final String VALID_GUESS_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String phrase = "";
		String player1nick, player2nick;
		String phraseMaker = "";
		String phraseGuesser = "";
		String nonGuessedCharacters = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9 ";
		String phraseHidden = "";
		String usedCharacters = "";
		String Winner = "";
		String phraseGuess = "";
		String close = "";

		// declared booleans
		boolean gameOver = false;
		boolean invalidPhrase = false;
		boolean halfRoundOver = false;
		boolean guessingChoice = true;
		boolean validGuessedCharacter = false;

		
		//Introduction to Hangman
		System.out.println("Welcome to Hangman!");
		System.out.println("-------------------");
		System.out.println("You and your partner will each have 5 turns each to guess each other's phrases.");
		System.out.println("Whoever has the most points at the end wins, if there is a tie a tie breaker will be played.\n");
		System.out.println("So lets play...\n \n");
		
		// get player nicknames/names
		System.out.print("Please enter Player 1's nickname: ");
		player1nick = keyboard.nextLine();

		System.out.print("Please enter Player 2's nickname: ");
		player2nick = keyboard.nextLine();

		// Start of Game
		while (!gameOver) { // while loops that loops the whole code until
							// "gameOver" is true, which will end the game
			
			
			
			for(int i = 0; i < 2; i++) { // when int i == 0, it is player 1's
											// turn
				
				if (i == 0) { // declaring roles depending on whether it's
								// player 1 or 2's turn
					phraseMaker = player1nick;
					phraseGuesser = player2nick;
					round++;
					if((round > roundLimit) && (player1 == player2)) {
						System.out.println("Tie Breaker ~");
						round ++;
					}else if(round > roundLimit){
						gameOver = true;
						break;
					}
	 
					
				} else if (i == 1) { // declaring roles depending on whether
										// it's player 1 or 2's turn
					phraseMaker = player2nick;
					phraseGuesser = player1nick;
					i = -1;
				} 

				// prompts for Phrase and displays points
				System.out.println("---------------------------");
				System.out.println("\nRound : " + round);
				System.out.println("Points : " + player1nick + " ~ " + player1 + ", " + player2nick + " ~ " + player2+ "\n");
				System.out.println(phraseMaker + ", please enter a Phrase or Word for " + phraseGuesser + " to guess:");

				// checks if phrase is alphanumeric
				invalidPhrase = false;
				while (!invalidPhrase) {
					phrase = "";
					phrase = keyboard.nextLine().toUpperCase();
					invalidPhrase = true;
					for (int j = 0; j < phrase.length(); j++) { // going through
																// all the chars

						if (VALID_PHRASE_CHARACTERS.indexOf(phrase.charAt(j)) == -1) {

							// for loop to loop through all char of phrase and
							// check against VALID_PHRASE_CHARACTERS using
							// indexOf
							// if -1 invalidPhrase = true

							System.out.println(phraseGuesser + ",please use only Alphanumeric Characters");
							invalidPhrase = false;
						}
					}
				}
				// print spaces
				int spaces = 0;
				while (spaces < 30) {
					System.out.println();
					spaces++;
				}

				halfRoundOver = false;
				
				// round starts
				
				while (!halfRoundOver) {
					guessCount = 7;
					phraseHidden = "";
					// converts phrase to underscores and slashes
					for (int k = 0; k < phrase.length(); k++) {
						if (phrase.charAt(k) != ' ') {
							phraseHidden += "-";
						} else {
							phraseHidden += "/";
						}
					}

					guessingChoice = true;

					while (guessingChoice) { // whether they are guessing a
												// phrase or character

						if (guessCount == 0) {
							System.out.println(phraseHidden + " You are out of guesses, Please guess the Phrase");
							phraseGuess = keyboard.nextLine().toUpperCase();

							if (phraseGuess.equals(phrase)) {
								System.out.println(phraseGuesser + ", you are Correct! The phrase was " + phrase);

								if (phraseGuesser.equals(player1nick)) {
									player1 +=  1;

								} else {
									player2 += 1;
								}
								guessingChoice = false;
								i = 0;
								halfRoundOver = true;

							} else {
								System.out.println(phraseGuesser + ",you are incorrect :(");
								guessCount--;
								guessingChoice = false;
							}

						} else {

							System.out.println("Phrase : " + phraseHidden + "  " + phraseGuesser + ", you have " + guessCount
									+ " guesses left, Please select (1) to guess the phrase, or (2) to guess a character");
							String choice = keyboard.nextLine();

							// if they want to guess the phrase
							if (choice.equals("1")) {

								System.out.println(phraseGuesser + ", please guess the phrase:");
								phraseGuess = keyboard.nextLine().toUpperCase();

								if (phraseGuess.equals(phrase)) {
									System.out.println(phraseGuesser + ", you are Correct! The phrase was \"" + phrase + "\" ");

									if (phraseGuesser.equals(player1nick)) {
										player1 += guessCount + 1;

									} else {
										player2 += guessCount + 1;
									}
									guessingChoice = false;
									
									halfRoundOver = true;

								} else {
									System.out.println(phraseGuesser + ", you are incorrect :(");
									guessCount--;
									
								}

								// if they want to guess a character
							} else if (choice.equals("2")) {

								System.out.println("Not Guessed Characters: " + nonGuessedCharacters);
								System.out.print(phraseGuesser + ", please guess a character: ");

								String character = "";
								
								// checks to make sure is Valid Guessed
								// Character
								validGuessedCharacter = false;

								while (!validGuessedCharacter) {

									validGuessedCharacter = true;

									character = keyboard.nextLine().toUpperCase();

									for (int k = 0; k < character.length() && validGuessedCharacter; k++) {

										if (character.length() != 1
												&& VALID_GUESS_CHARACTERS.indexOf(character.charAt(k)) == -1) { // Checks
																												// for
																												// Alpha
																												// numeric
											validGuessedCharacter = false;
											System.out.println(phraseGuesser + ",please guess a valid alpha numeric character: ");

										} else if (character.length() != 1) {
											validGuessedCharacter = false;
											System.out.println(phraseGuesser + ",please guess a valid \"single\" character: "); // checks
																												// for
																												// single
																												// character

										}
										for (int j = 0; j <= character.length() - 1; j++) { // checks
																						// if
																						// character
																						// was
																						// already
																						// guessed
											if (usedCharacters.indexOf(character) != -1) {
												validGuessedCharacter = false;
												System.out.println(
														phraseGuesser + ", you have already guessed this letter. Please enter another letter:");
											}
										}
									}
								}
								usedCharacters = String.valueOf(usedCharacters) + character;
								nonGuessedCharacters = nonGuessedCharacters.replaceAll(character, "_");

								 // check
																		// the
																		// characters
																		// are
																		// in
																		// the
																		// phrase
									if (phrase.indexOf(character.charAt(0)) != -1) {
										System.out.println(phraseGuesser + ", good job " + character + " is in the phrase!");
										
										for(int k = 0 ; k<phrase.length(); k++){
											if (phrase.substring(k, k+1).equals(character)){
												phraseHidden = phraseHidden.substring(0,k) + character + phraseHidden.substring(k+1);
											}
										}	
									} else {
										System.out.println(phraseGuesser + ", the character " + character
												+ " is not in the phrase");
								
									
								}
									guessCount--;
							}

						}
					}
					
					 
				}
		
				
			}	
				
			
				
				guessCount--;
				if (guessCount == 0) {
					halfRoundOver = false;
					round ++;
				}
				

				guessCount = 7; // to re-establish
				nonGuessedCharacters = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9 ";// to re-establish
				usedCharacters = "";// to re-establish
				
		
			
		} 
			if (player1 > player2){
			Winner = player1nick;
		}else{
			Winner = player2nick;
		}
		System.out.println("\n \n \n Game Over! The Winner is " + Winner + " with " + player1 + " points.");
		System.out.println("Please type anything to close the game");
		close = keyboard.nextLine();
		
		
	}
	
}