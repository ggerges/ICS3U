package com.bayviewglen.horserace;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HorseRacingAssignment {
	static Thread thread= new Thread();
	public static void main(String[] args) throws InterruptedException {

		Scanner keyboard = new Scanner(System.in);

		introMessage();

		String[] horses = getHorses(); 
		String[] playerNames = getPlayerNames();
		int[] playerWallets = getPlayerWallets();
		String[] horseFeatures = getHorseFeatures();
		
		
		playerInput(keyboard, playerNames, playerWallets);
		playerNames = getPlayerNames(); 
		playerWallets = getPlayerWallets();
	
		
		spacer();
		

		boolean gameOver = false;
		while (!gameOver) {
			doRace(horses, playerNames, playerWallets, keyboard,horseFeatures);
			updatePlayerData(playerNames, playerWallets);
			gameOver = keepGoing(keyboard, gameOver);
			
		}
		outroMessage();

	}


	
	//Methods from time used
	
//Methods that import/write from/to file
private static String[] getPlayerNames() { //Imports player Names from file
		String[] players = null;

		try {
			Scanner scanner = new Scanner(new File("input/player.dat"));
			int numPlayers = Integer.parseInt(scanner.nextLine());
			players = new String[numPlayers];

			for (int i = 0; i < numPlayers; i++) {
				players[i] = (scanner.nextLine()).split(" ")[0];
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}
		return players;
	}
private static int[] getPlayerWallets() { //Imports player Wallets from file

		int[] playerWallets = null;
		try {
			Scanner scanner = new Scanner(new File("input/player.dat"));
			int numPlayers = Integer.parseInt(scanner.nextLine());
			playerWallets = new int[numPlayers];

			for (int i = 0; i < numPlayers; i++) {
				playerWallets[i] = Integer.parseInt((scanner.nextLine().split(" ")[1]));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}

		return playerWallets;
	}
public static String[] getHorses() { //Gets Horses from file
		String[] horses = null;
		try {
			Scanner scanner = new Scanner(new File("input/horses.dat"));
			int numHorses = Integer.parseInt(scanner.nextLine());
			horses = new String[numHorses];

			for (int i = 0; i < numHorses; i++) {
				horses[i] = scanner.nextLine();
			}

			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
			e.printStackTrace();
		}

		return horses;
	}
private static String[] getHorseFeatures() { //gets Horse Features from file
	String[] horseFeatures = null;
	try {
		Scanner scanner = new Scanner(new File("input/horseFeatures.dat"));
		int numHorses = Integer.parseInt(scanner.nextLine());
		horseFeatures = new String[numHorses];

		for (int i = 0; i < numHorses; i++) {
			horseFeatures[i] = scanner.nextLine();
		}

		scanner.close();

	} catch (FileNotFoundException e) {
		System.out.println("File not Found");
		e.printStackTrace();
	}

	return horseFeatures;
}
private static void updatePlayerData(String[] playerNames, int[] playerWallets) { //Updates player data (Names and Wallets) in File
	int numOfNames = playerNames.length;
	try {

		FileWriter fw = new FileWriter(new File("input/player.dat"));
		fw.write(numOfNames + "\n");
		for (int i = 0; i < playerNames.length; i++) {
			fw.write(playerNames[i] + " " + playerWallets[i] + " \n");
		}

		fw.close();
	} catch (IOException e) {
		System.out.print("Player file not found");
		e.printStackTrace();
	}

}

	

//Methods before game starts

private static void introMessage() { //Intro Message to game

	System.out.println("Welcome to Horse Racing!!\n");

	System.out.println("Horse racing is an equestrian performance sport, typically involving two or more horses\n"
			+ "ridden by jockeys or driven over a set distance for competition. It is one of the most ancient of\n"
			+ "all sports and its basic premise – to identify which of two or more horses is the fastest over a\n"
			+ "set course or distance – has remained unchanged since the earliest times.\n");
	System.out.println("In this game you will be able to experience the Thrill of placing money of a Horse and also the pain \nwhen you lose money from your Horse not winning, "
			+ "or the Joy of getting money from your Horse winning.\n");

}
private static void playerInput(Scanner keyboard, String[] playerNames, int[] playerWallets) { // Asks if player wants to add more Players

		
		
		boolean done = false;
		while(!done){
			System.out.println("\nHere are the players currently in the Game:\n");
	
			String names = "";
		for(int i = 0; i<playerNames.length;i++){
			
			if(playerNames.length == 1){
				names += ("|  " + playerNames[i] + "  |");
			}else if(i == (playerNames.length-1)){
				names += ("and " + playerNames[i] + " |");
			}else if(i == 0){
				names += ("| " + playerNames[i] + " | ");
				
			}else{
			names += (playerNames[i] + " | ");
			}
		}
		for(int i = 0; i<names.length();i++){
			System.out.print("-");
		}
		System.out.print("\n");
		System.out.println(names + "");
		for(int i = 0; i<names.length();i++){
			System.out.print("-");
		}
		System.out.print("\n\n");
		
		
		 
		boolean valid = true;
		while(valid){
		System.out.println("Would you like to add a player to the game?(1) or continue with existing Players?(2):");
		int choice = keyboard.nextInt();
		if (choice == 1) {
			
			
			
			System.out.println("\nWhat is the name of the player you would like to add?");
			keyboard.nextLine();
			String player = keyboard.nextLine();
			boolean alreadyInGame = false;
			for(int i=0; i<playerNames.length;i++){
				if(playerNames[i].equals(player)){
					System.out.println("\n\nPlayer is already in Game.\n");
					alreadyInGame = true;
				}
			}
			if(!alreadyInGame){
			playerNames = addPlayer(player,playerNames);
			playerWallets = addPlayerWallet(playerWallets);
			updatePlayerData(playerNames,playerWallets);
		
			}


			valid = false;	

			}
		else if(choice == 2){
			System.out.println("\n\nstarting game......");
			valid = false;
			done = true;
		}
		}
		
		}
		
	}
private static int[] addPlayerWallet(int[] playerWallets) { //adds player Wallet to new player

	int [] newPlayerWallets = new int[playerWallets.length+1];
	for(int i = 0; i<playerWallets.length;i++){
		newPlayerWallets[i] = playerWallets[i];
	}
	newPlayerWallets[newPlayerWallets.length-1] = 1000;
	return newPlayerWallets;
}
private static String[] addPlayer(String player, String [] playerNames) { //adds new player Name to playerNames 
	
	String[] newPlayers = new String[playerNames.length+1];
	for(int i = 0; i<playerNames.length; i++){
		newPlayers[i] = playerNames[i];
	}
	newPlayers[newPlayers.length-1] = player;
	return newPlayers;
	

}
private static void spacer() throws InterruptedException { //Spacer
		thread.sleep(1000);
		System.out.println("\n");
		int i=0;
		while(i<5){
			System.out.print("--------------------------------------------------------");
			System.out.print("________________________________________________________");
			System.out.print("--------------------------------------------------------");
			System.out.print("________________________________________________________");
			System.out.println("--------------------------------------------------------");
			
			i++;
		}
		System.out.println("\n\n");
		
	}


//Methods in !GameOver
private static void doRace(String[] horses, String[] playerNames, int[] playerWallets, Scanner keyboard, String[] horseFeatures) throws InterruptedException { //PERFORMS RACE*** IMPORTANT
	int[] horsesInRace = getHorsesInRace(horses);
	
	String [] horseFeaturesInRace = getHorseFeaturesInRace(horseFeatures,horsesInRace);

	
	int[][]playerBets = getPlayerBets(playerNames, playerWallets, horsesInRace, horseFeaturesInRace,  horses, keyboard);
	
	System.out.println("Race will start shortly ...");
	thread.sleep(1500);
	
	int winningHorse = startRace(horsesInRace,horses); //the index of the horse in the horsesInRace array
	
	payOutBets(playerBets, playerWallets, playerNames, winningHorse);

}
	//In doRace
	private static int[] getHorsesInRace(String[] horses) { //Gets horses for race

	int amountOfHorses = (int) (Math.random() * (8 - 5) + 5); // makes new int and puts random number between 5 and 8 (amount of horses in race)
	int[] horsesArray = new int[amountOfHorses]; // makes new int array for
													// the indexes of the
													// horses

	for (int i = 0; i < amountOfHorses; i++) { // puts indexes into the
												// array
		horsesArray[i] = (int) (Math.random() * (horses.length) + 1);
		
		if (i != 0){
			if (alreadyInRace(horsesArray[i], horsesArray,i)) {
				horsesArray[i] = 0;
				i = i - 1;
		}
			
		}

	}
	return horsesArray;
}
		
	public static boolean alreadyInRace(int horse, int[] horsesInRace,int j) { //Checks to see if Horses are already in Race, if so it adds a new Horse

		for (int i = 0; i < j; i++) {
			
			if (horsesInRace[i] == horse) {
				return true;
			}
		}

		return false;
	}
	
	private static String[] getHorseFeaturesInRace(String[] horseFeatures, int[] horsesInRace) { //Gets Horse Features for Race
	
	int amountOfHorses = horsesInRace.length;
	String[] features= new String[amountOfHorses]; 
	for (int i = 0; i < amountOfHorses; i++) { 

		features[i] = horseFeatures[(int) (Math.random() * (horseFeatures.length) )];

	}
	return features;
}	
	
	public static int[][] getPlayerBets(String[] playerNames, int[] playerWallets, int[] horsesInRace, String[] horseFeaturesInRace, String[] horses, Scanner keyboard) {	//Gets Player Bets
	
		displayCurrentWallets(playerNames, playerWallets);
		displayCurrentHorses(horsesInRace,horseFeaturesInRace,horses);
		
		
		int player = 0, amount = 0;
		boolean betting = true;
		int choice = 0;
		int horse = 0;		
		
	int [][] playerBets = new int[playerNames.length][horsesInRace.length]; //rows= players, cols = horses, inbetween = bets
		while(betting){
			
			System.out.println("\n\n\nWould a player like to place Bets on a Horse? Yes, let me bet(1) No, Start the race(2)");
			choice = keyboard.nextInt();
			if(choice == 1){
				amount = 0;
				horse = 0;
			
				
				
				boolean valid = true;
				while(valid){
				System.out.println("\nWhich Player (0-" + (playerNames.length-1) + ") is betting?");
				player = 0;
				player = keyboard.nextInt();
				if(player >= 0 && player <= playerNames.length-1){
					break;
				}
				
				}
				valid = true;
				while(valid){
				System.out.println("\n" + playerNames[player] + ", which Horse would you like to bet on (0-" + (horsesInRace.length-1) + ")?");
				horse = 0;
				horse = keyboard.nextInt();
				if(horse >=0 && horse<=horsesInRace.length-1){
					break;
				}
				
				}
				valid = true;
				while(valid){
				System.out.println("\n" + playerNames[player] + ", how much money would you like to bet on "+ horses[horsesInRace[horse]] + "?");
				amount = 0;
				amount = keyboard.nextInt();
				if(amount > playerWallets[player]){
					System.out.println("\n" + playerNames[player] + ", you don't have $" + amount);
				}else{
					break;
				}
				}
				
				playerBets[player][horse] = amount;
				System.out.println("\n" + playerNames[player]+ ", you have bet $"+ amount + " on "+ horses[horsesInRace[horse]] + ".\n");
			
				
			}else if(choice ==2){		
					break;
				}
		}
		System.out.print("\n");
		
		return playerBets;
		
		

		

	}

		private static void displayCurrentWallets(String[] playerNames, int[] playerWallets) { //Displays the Wallets of The Players
		
		System.out.print("\n Here are the current player wallets:\n");
		int line = 0;
		for(int i =0; i<playerNames.length; i++){
			if(i == playerNames.length-1){
				System.out.printf("%s%13s%12s", " |", " " + i, " |");
				line += 2;
			}else{
				System.out.printf("%s%13s%12s", " |", " " + i, " ");
			}
			
			line += 1+13+12; //the length of the printf
		}
		System.out.println("");
		for(int i = 0; i<playerNames.length;i++){
			if(i == playerNames.length-1){
				System.out.printf("%s%14s%11s"," |",  " " + playerNames[i],  " |");
				
			}else{
			System.out.printf("%s%15s%10s", " |", " " + playerNames[i], " ");
			}
		}
		System.out.println("");
		for(int i = 0; i<playerWallets.length; i++){
			
			if(i == playerWallets.length-1){
				System.out.printf("%s%14s%11s"," |",  " $" + playerWallets[i],  " |");
				
			}else{
			System.out.printf("%s%14s%11s"," |",  " $" + playerWallets[i],  " ");
			}
		}
		System.out.println("");
		System.out.print(" ");
		for(int i = 0; i<line; i++){
			System.out.print("-");
		}
		
		
	}

		private static void displayCurrentHorses(int[] horsesInRace, String[] horseFeatures, String[] horses) { //Displays the Horses in the Race and their Features
		
		System.out.println("\n\n Here are the horses in the race and their features:");
		
		int line = 0;
		for(int i =0; i<horsesInRace.length; i++){
			if(i == horsesInRace.length-1){
				System.out.printf("%s%13s%12s", " |", " " + i, " |");
				line += 4;
			}else{
				System.out.printf("%s%13s%12s", " |", " " + i, " ");
			}
			
			line += 1+13+12; //the length of the printf
		}
		System.out.println("");
		for(int i = 0; i<horsesInRace.length;i++){
			if(i == horsesInRace.length-1){
				System.out.printf("%s%14s%11s"," |",  " " + horses[horsesInRace[i]],  " |");
				
			}else{
			System.out.printf("%s%15s%10s", " |", " " + horses[horsesInRace[i]], " ");
			}
		}
		System.out.println("");
		for(int i = 0; i<horsesInRace.length; i++){
			
			if(i == horsesInRace.length-1){
				System.out.printf("%s%15s%10s"," |",  " " + horseFeatures[i],  " |");
				
			}else{
			System.out.printf("%s%14s%11s"," |",  " " + horseFeatures[i],  " ");
			}
		}
		System.out.println("");
		System.out.print(" ");
		for(int i = 0; i<line; i++){
			System.out.print("-");
		}
		
		
	}

	private static int startRace(int[] horsesInRace, String[] horses) throws InterruptedException{  //Starts Race
		

		int winningHorse = 0;
		
		int winningLength = 50; 
		
		
		
		boolean race = true;
		
	
		for(int j = 3; j>=1; j--){
			System.out.println("The Race will start in: " + j);
			thread.sleep(1000);
				}
				System.out.println("\nStart!\n");
			
				boolean justStarted = true;
				int[] horseMoves = new int[horsesInRace.length];
		while(race){
			
			
			System.out.println("Start                                                                 Finish\n");
			for(int i = 0; i<horsesInRace.length; i++){ //move all horses in race
				if(!justStarted){
				horseMoves[i] += (int) (Math.random()*3 + 1); //adds spaces for each horse
				}
				
				if(horseMoves[winningHorse] >= winningLength){
					race = false;
					}
				if(horseMoves[i] > horseMoves[winningHorse]){
					
					 winningHorse = i;
					
				}
				System.out.printf("%15s%10s",horses[horsesInRace[i]], " |");
				for(int j = 0; j<horseMoves[i];j++){ //inserts the spaces for each horse
				System.out.print(" ");
			}
				
				System.out.println(i+1);
				for(int j = 0; j<winningLength+26; j++){
					System.out.print("-");
				}
				System.out.println("");
				
				
			}
			
			System.out.println("\n\n");
			justStarted = false;
			thread.sleep(750);
			
		}
	
		System.out.println("The Winning horse is : " + horses[horsesInRace[winningHorse]] + "!\n\n");
		
		return winningHorse;
	}
	
	private static void payOutBets(int[][] playerBets, int[] playerWallets, String[] playerNames, int winningHorse) {
		
		for(int rows = 0; rows<playerBets.length; rows++){//players
			
			for(int cols = 0; cols<playerBets[rows].length; cols++){//horses
				if(playerBets[rows][cols] > 0 && cols == winningHorse){
					playerWallets[rows] += playerBets[rows][cols];
				}
				else playerWallets[rows] -= playerBets[rows][cols]; 
				}
				
			}
		}
	//----------
	
private static boolean keepGoing(Scanner keyboard, boolean gameOver) { //Checks if player wants to continue playing, or end

	int choice =0;
	System.out.println("Would you like to play another round(1) or Exit and save(2)?" );
	choice = keyboard.nextInt();
	
	if(choice == 2){
		gameOver = true;
	} else if (choice == 1){
		gameOver = false;
	}
	return gameOver;
	}


//After GameOver
private static void outroMessage() throws InterruptedException{

	System.out.println("\n\nHope you enjoyed the adventure and excitment of Horse Racing! See you later!");
	thread.sleep(1000);
	System.out.print("                 ( ^_^)/  |");
	thread.sleep(1000);
	System.out.print("   ( ^_^)/   |");
	thread.sleep(1000);
	System.out.print("    ( ^_^)/    " );
	//this is waving goodbye

}


//Methods I'm not quite sure about what they do or whether they are used

public int getValidInput(int min, int max, Scanner input) { //This is never used but I don't want to get rid of it
	boolean isValid = false;
	int x = 0;
	while (!isValid) {
		try {
			x = Integer.parseInt(input.nextLine());
			if (x >= min && x <= max)
				isValid = true;
		} catch (Exception ex) {

		}
	}
	return x;
}
public static String[] horseSelect(String[] horses, int amountOfHorses) { //Gets Horses for Race

	String[] newHorses = new String[amountOfHorses];

	for (int i = 0; i < newHorses.length; i++) {

		newHorses[i] = horses[(int) Math.random() * horses.length + 1];
	}

	return newHorses;
}


}
