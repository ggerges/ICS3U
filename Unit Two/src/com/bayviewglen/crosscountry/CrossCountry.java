package com.bayviewglen.crosscountry;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountry {
	
	static final int sixty = 60;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000");
		
		// First and Last Name
		System.out.print("Please enter your First and Last name : ");
		String name = scanner.nextLine();
		String firstName = (name.split(" ")[0]);
		String lastName = (name.split(" ")[1]);

		// First Mile Time
		System.out.print(firstName + ", please enter the time for the First Mile (mm:ss.sss): ");
		String time1 = scanner.nextLine();
		int minutes = Integer.parseInt(time1.split(":")[0]);
		int	minutesSeconds = minutes*sixty;
		double seconds = Double.parseDouble(time1.split(":")[1]);
		double totalSeconds = minutesSeconds + seconds;
		

		// Second Mile Time
		System.out.print(firstName + ", please enter the time taken to get to the end of the Second Mile (mm:ss.sss): ");
		String time2 = scanner.nextLine();
		int minutes2 = Integer.parseInt(time2.split(":")[0]);
		int minutes2Seconds = minutes2 * sixty;
		double seconds2 = Double.parseDouble(time2.split(":")[1]);
		double totalSeconds2 = minutes2Seconds + seconds2;

		// 5km time
		System.out.print(firstName + ", please enter the time taken to run the 5km (mm:ss.sss): ");
		String time3 = scanner.nextLine();
		int minutes3 = Integer.parseInt(time3.split(":")[0]);
		int minutes3Seconds = minutes3 * sixty;
		double seconds3 = Double.parseDouble(time3.split(":")[1]);
		double totalSeconds3 = minutes3Seconds + seconds3;
		
		
		//SplitTwo
		double splitTwoTotalSeconds = (totalSeconds2-totalSeconds);
		int splitTwoMin = (int)(splitTwoTotalSeconds)/sixty;
		double splitTwoSeconds = (splitTwoTotalSeconds) - splitTwoMin* sixty;
		
		
		
		//SplitThree
		double splitTwoAndOneSeconds = (totalSeconds + totalSeconds2);
		double splitThreeTotalSeconds = (splitTwoAndOneSeconds-totalSeconds3);
		int splitThreeMin = (int)(splitThreeTotalSeconds)/sixty;
		double splitThreeSeconds = (splitThreeTotalSeconds) - splitThreeMin* sixty;
		
		//Runner Summary 
		System.out.println("");
		System.out.println("  	   Runner One Summary");
		System.out.println(" 	  ------------------------");
		System.out.println("");
		System.out.println("	Runner:" + name);
		System.out.println("	Split One : " + minutes + ":" + formatter.format(seconds));
		System.out.println("	Split Two : " + splitTwoMin + ":" + formatter.format(splitTwoSeconds));
		System.out.println("	Split Three: "+ splitThreeMin + ":" + formatter.format(splitThreeSeconds));
		System.out.println("	Total: "+ minutes3 + ":" + formatter.format(seconds3));
	}

}
