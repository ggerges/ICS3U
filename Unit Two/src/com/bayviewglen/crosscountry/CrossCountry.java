package com.bayviewglen.crosscountry;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountry {

	static final int SIXTY = 60;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("00.000");
		
		
		System.out.println("Bayview Glen Cross-Country Split Calculator");
		System.out.println(" ");
		// First and Last Name
		System.out.print("Please enter your First and Last name : ");
		String n1 = scanner.nextLine(); // = n is name
		String fn1 = (n1.split(" ")[0]); // ft = first name
		String ln1 = (n1.split(" ")[1]); // ln = last name

		// First Mile Time
		System.out.print(fn1 + ", please enter the time for the First Mile (mm:ss.sss): ");
		String time1 = scanner.nextLine(); // 1 = the first time for the first
											// runner
		int min1 = Integer.parseInt(time1.split(":")[0]); // min = minutes
		int minSec1 = min1 * SIXTY; // minSec = Minutes turned to seconds
		double secs1 = Double.parseDouble(time1.split(":")[1]); // secs =
																// seconds
		double totalSecs1 = minSec1 + secs1; // gets total seconds

		// Second Mile Time
		System.out.print(fn1 + ", please enter the time taken to get to the end of the Second Mile (mm:ss.sss): ");
		String time21 = scanner.nextLine(); // 21 = the seconds time for the
											// first runner
		int min21 = Integer.parseInt(time21.split(":")[0]);
		int minSec21 = min21 * SIXTY;
		double secs21 = Double.parseDouble(time21.split(":")[1]);
		double totalSecs21 = minSec21 + secs21;

		// 5km time
		System.out.print(fn1 + ", please enter the time taken to run the 5km (mm:ss.sss): ");
		String time31 = scanner.nextLine(); // 31 = the third time for the first
											// runner
		int min31 = Integer.parseInt(time31.split(":")[0]);
		int minSec31 = min31 * SIXTY;
		double secs31 = Double.parseDouble(time31.split(":")[1]);
		double totalSecs31 = minSec31 + secs31;

		// SplitTwo
		double splitTwoTS1 = (totalSecs21 - totalSecs1); // TS = total seconds
		int splitTwoMin1 = (int) (splitTwoTS1) / SIXTY;
		double splitTwoSecs1 = (splitTwoTS1) - splitTwoMin1 * SIXTY;

		// SplitThree
		double splitThreeTS1 = (totalSecs31 - totalSecs21);
		int splitThreeMin1 = (int) (splitThreeTS1) / SIXTY;
		double splitThreeSecs1 = (splitThreeTS1) - splitThreeMin1 * SIXTY;

		// Runner Summary
		System.out.println("");
		System.out.println("  	Runner One Summary");
		System.out.println("    ------------------------");
		System.out.println("	Runner: " + ln1 + ", " + fn1);
		System.out.println("");
		System.out.println("	Split One : " + min1 + ":" + formatter.format(secs1));
		System.out.println("	Split Two : " + splitTwoMin1 + ":" + formatter.format(splitTwoSecs1));
		System.out.println("	Split Three: " + splitThreeMin1 + ":" + formatter.format(splitThreeSecs1));
		System.out.println("	Total: " + min31 + ":" + formatter.format(secs31));

		/*---------------------------------------------------------------------------------------------------------
		 * First Runner ^^^^^^^^^^^^^^  
		 */
		// First and Last Name - 2 represents the second runner
		System.out.println("");
		System.out.println("");
		System.out.print("Please enter your First and Last name : ");
		String n2 = scanner.nextLine(); // = n is name
		String fn2 = (n2.split(" ")[0]); // ft = first name
		String ln2 = (n2.split(" ")[1]); // ln = last name

		// First Mile Time
		System.out.print(fn2 + ", please enter the time for the First Mile (mm:ss.sss): ");
		String time2 = scanner.nextLine(); // 1 = the first time for the first
											// runner
		int min2 = Integer.parseInt(time2.split(":")[0]); // min = minutes
		int minSec2 = min2 * SIXTY; // minSec = Minutes turned to seconds
		double secs2 = Double.parseDouble(time2.split(":")[1]); // secs =
																// seconds
		double totalSecs2 = minSec2 + secs2; // gets total seconds

		// Second Mile Time
		System.out.print(fn2 + ", please enter the time taken to get to the end of the Second Mile (mm:ss.sss): ");
		String time22 = scanner.nextLine(); // 22 = the seconds time for the
											// second runner
		int min22 = Integer.parseInt(time22.split(":")[0]);
		int minSec22 = min22 * SIXTY;
		double secs22 = Double.parseDouble(time22.split(":")[1]);
		double totalSecs22 = minSec22 + secs22;

		// 5km time
		System.out.print(fn2 + ", please enter the time taken to run the 5km (mm:ss.sss): ");
		String time32 = scanner.nextLine(); // 32 = the third time for the
											// second runner
		int min32 = Integer.parseInt(time32.split(":")[0]);
		int minSec32 = min32 * SIXTY;
		double secs32 = Double.parseDouble(time32.split(":")[1]);
		double totalSecs32 = minSec32 + secs32;

		// SplitTwo
		double splitTwoTS2 = (totalSecs22 - totalSecs2); // TS = total seconds
		int splitTwoMin2 = (int) (splitTwoTS2) / SIXTY;
		double splitTwoSecs2 = (splitTwoTS2) - splitTwoMin2 * SIXTY;

		// SplitThree
		double splitThreeTS2 = (totalSecs32 - totalSecs22);
		int splitThreeMin2 = (int) (splitThreeTS2) / SIXTY;
		double splitThreeSecs2 = (splitThreeTS2) - splitThreeMin2 * SIXTY;

		// Runner Summary
		System.out.println("");
		System.out.println("  	Runner Two Summary");
		System.out.println("    ------------------------");
		System.out.println("	Runner: " + ln2 + ", " + fn2);
		System.out.println("");
		System.out.println("	Split One : " + min2 + ":" + formatter.format(secs2));
		System.out.println("	Split Two : " + splitTwoMin2 + ":" + formatter.format(splitTwoSecs2));
		System.out.println("	Split Three: " + splitThreeMin2 + ":" + formatter.format(splitThreeSecs2));
		System.out.println("	Total: " + min32 + ":" + formatter.format(secs32));
		/*--------------------------------------------------------------------------------------------------------
		 * Second Runner ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		 */
		// First and Last Name
		System.out.println("");
		System.out.println("");
		System.out.print("Please enter your First and Last name : ");
		String n3 = scanner.nextLine(); // = n is name
		String fn3 = (n3.split(" ")[0]); // ft = first name
		String ln3 = (n3.split(" ")[1]); // ln = last name

		// First Mile Time
		System.out.print(fn3 + ", please enter the time for the First Mile (mm:ss.sss): ");
		String time3 = scanner.nextLine(); // 3 = the first time for the third
											// runner
		int min3 = Integer.parseInt(time3.split(":")[0]); // min = minutes
		int minSec3 = min3 * SIXTY; // minSec = Minutes turned to seconds
		double secs3 = Double.parseDouble(time3.split(":")[1]); // secs =
																// seconds
		double totalSecs3 = minSec3 + secs3; // gets total seconds

		// Second Mile Time
		System.out.print(fn3 + ", please enter the time taken to get to the end of the Second Mile (mm:ss.sss): ");
		String time23 = scanner.nextLine(); // 23 = the second time for the
											// third Runner
											// third runner
		int min23 = Integer.parseInt(time23.split(":")[0]);
		int minSec23 = min23 * SIXTY;
		double secs23 = Double.parseDouble(time23.split(":")[1]);
		double totalSecs23 = minSec23 + secs23;

		// 5km time
		System.out.print(fn3 + ", please enter the time taken to run the 5km (mm:ss.sss): ");
		String time33 = scanner.nextLine(); // 33 = the third time for the third
											// runner
		int min33 = Integer.parseInt(time33.split(":")[0]);
		int minSec33 = min33 * SIXTY;
		double secs33 = Double.parseDouble(time33.split(":")[1]);
		double totalSecs33 = minSec33 + secs33;

		// SplitTwo
		double splitTwoTS3 = (totalSecs23 - totalSecs3); // TS = total seconds
		int splitTwoMin3 = (int) (splitTwoTS3) / SIXTY;
		double splitTwoSecs3 = (splitTwoTS3) - splitTwoMin3 * SIXTY;

		// SplitThree
		double splitThreeTS3 = (totalSecs33 - totalSecs23);
		int splitThreeMin3 = (int) (splitThreeTS3) / SIXTY;
		double splitThreeSecs3 = (splitThreeTS3) - splitThreeMin3 * SIXTY;

		// Runner Summary
		System.out.println("");
		System.out.println("  	Runner Three Summary");
		System.out.println("    ------------------------");
		System.out.println("	Runner: " + ln3 + ", " + fn3);
		System.out.println("");
		System.out.println("	Split One : " + min3 + ":" + formatter.format(secs3));
		System.out.println("	Split Two : " + splitTwoMin3 + ":" + formatter.format(splitTwoSecs3));
		System.out.println("	Split Three: " + splitThreeMin3 + ":" + formatter.format(splitThreeSecs3));
		System.out.println("	Total: " + min33 + ":" + formatter.format(secs33));
		/*--------------------------------------------------------------------------------------------------------
		 * Third Runner   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		 */
		// First and Last Name
		System.out.println("");
		System.out.println("");
		System.out.print("Please enter your First and Last name : ");
		String n4 = scanner.nextLine(); // = n is name
		String fn4 = (n4.split(" ")[0]); // ft = first name
		String ln4 = (n4.split(" ")[1]); // ln = last name

		// First Mile Time
		System.out.print(fn4 + ", please enter the time for the First Mile (mm:ss.sss): ");
		String time4 = scanner.nextLine(); // 4 = the first time for the fourth
											// runner
		int min4 = Integer.parseInt(time4.split(":")[0]); // min = minutes
		int minSec4 = min4 * SIXTY; // minSec = Minutes turned to seconds
		double secs4 = Double.parseDouble(time4.split(":")[1]); // secs =
																// seconds
		double totalSecs4 = minSec4 + secs4; // gets total seconds

		// Second Mile Time
		System.out.print(fn4 + ", please enter the time taken to get to the end of the Second Mile (mm:ss.sss): ");
		String time24 = scanner.nextLine(); // 24 = the second time for the
											// fourth Runner
		int min24 = Integer.parseInt(time24.split(":")[0]);
		int minSec24 = min24 * SIXTY;
		double secs24 = Double.parseDouble(time24.split(":")[1]);
		double totalSecs24 = minSec24 + secs24;

		// 5km time
		System.out.print(fn4 + ", please enter the time taken to run the 5km (mm:ss.sss): ");
		String time34 = scanner.nextLine(); // 34 = the third time for the
											// fourth
											// runner
		int min34 = Integer.parseInt(time34.split(":")[0]);
		int minSec34 = min34 * SIXTY;
		double secs34 = Double.parseDouble(time34.split(":")[1]);
		double totalSecs34 = minSec34 + secs34;

		// SplitTwo
		double splitTwoTS4 = (totalSecs24 - totalSecs4); // TS = total seconds
		int splitTwoMin4 = (int) (splitTwoTS4) / SIXTY;
		double splitTwoSecs4 = (splitTwoTS4) - splitTwoMin4 * SIXTY;

		// SplitThree
		double splitThreeTS4 = (totalSecs34 - totalSecs24);
		int splitThreeMin4 = (int) (splitThreeTS4) / SIXTY;
		double splitThreeSecs4 = (splitThreeTS4) - splitThreeMin4 * SIXTY;

		// Runner Summary
		System.out.println("");
		System.out.println("  	Runner Four Summary");
		System.out.println("    ------------------------");
		System.out.println("	Runner: " + ln4 + ", " + fn4);
		System.out.println("");
		System.out.println("	Split One : " + min4 + ":" + formatter.format(secs4));
		System.out.println("	Split Two : " + splitTwoMin4 + ":" + formatter.format(splitTwoSecs4));
		System.out.println("	Split Three: " + splitThreeMin4 + ":" + formatter.format(splitThreeSecs4));
		System.out.println("	Total: " + min34 + ":" + formatter.format(secs34));

		/*--------------------------------------------------------------------------------------------------------
		 * Fourth Runner   ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		 */
		// First and Last Name - 5 means fifth runner
		System.out.println("");
		System.out.println("");
		System.out.print("Please enter your First and Last name : ");
		String n5 = scanner.nextLine(); // = n is name
		String fn5 = (n5.split(" ")[0]); // ft = first name
		String ln5 = (n5.split(" ")[1]); // ln = last name

		// First Mile Time
		System.out.print(fn5 + ", please enter the time for the First Mile (mm:ss.sss): ");
		String time5 = scanner.nextLine(); // 5 = the first time for the fifth
											// runner
		int min5 = Integer.parseInt(time5.split(":")[0]); // min = minutes
		int minSec5 = min5 * SIXTY; // minSec = Minutes turned to seconds
		double secs5 = Double.parseDouble(time5.split(":")[1]); // secs =
																// seconds
		double totalSecs5 = minSec5 + secs5; // gets total seconds

		// Second Mile Time
		System.out.print(fn5 + ", please enter the time taken to get to the end of the Second Mile (mm:ss.sss): ");
		String time25 = scanner.nextLine(); // 25 = the second time for the
											// fifith Runner

		int min25 = Integer.parseInt(time25.split(":")[0]);
		int minSec25 = min25 * SIXTY;
		double secs25 = Double.parseDouble(time25.split(":")[1]);
		double totalSecs25 = minSec25 + secs25;

		// 5km time
		System.out.print(fn5 + ", please enter the time taken to run the 5km (mm:ss.sss): ");
		String time35 = scanner.nextLine(); // 35 = the third time for the fifth
											// runner
		int min35 = Integer.parseInt(time35.split(":")[0]);
		int minSec35 = min35 * SIXTY;
		double secs35 = Double.parseDouble(time35.split(":")[1]);
		double totalSecs35 = minSec35 + secs35;

		// SplitTwo
		double splitTwoTS5 = (totalSecs25 - totalSecs5); // TS = total seconds
		int splitTwoMin5 = (int) (splitTwoTS5) / SIXTY;
		double splitTwoSecs5 = (splitTwoTS5) - splitTwoMin5 * SIXTY;

		// SplitThree
		double splitThreeTS5 = (totalSecs35 - totalSecs25);
		int splitThreeMin5 = (int) (splitThreeTS5) / SIXTY;
		double splitThreeSecs5 = (splitThreeTS5) - splitThreeMin5 * SIXTY;

		// Runner Summary
		System.out.println("");
		System.out.println("  	Runner Five Summary");
		System.out.println("    ------------------------");
		System.out.println("	Runner: " + ln5 + ", " + fn5);
		System.out.println("");
		System.out.println("	Split One : " + min5 + ":" + formatter.format(secs5));
		System.out.println("	Split Two : " + splitTwoMin5 + ":" + formatter.format(splitTwoSecs5));
		System.out.println("	Split Three: " + splitThreeMin5 + ":" + formatter.format(splitThreeSecs5));
		System.out.println("	Total: " + min35 + ":" + formatter.format(secs35));

		// Strings Runner One
		String split11 = min1 + ":" + formatter.format(secs1);
		String split21 = splitTwoMin1 + ":" + formatter.format(splitTwoSecs1);
		String split31 = splitThreeMin1 + ":" + formatter.format(splitThreeSecs1);
		String total1 = min31 + ":" + formatter.format(secs31);
		// Strings Runner Two
		String split12 = min2 + ":" + formatter.format(secs2);
		String split22 = splitTwoMin2 + ":" + formatter.format(splitTwoSecs2);
		String split32 = splitThreeMin2 + ":" + formatter.format(splitThreeSecs2);
		String total2 = min32 + ":" + formatter.format(secs32);
		// Strings Runner Three
		String split13 = min3 + ":" + formatter.format(secs3);
		String split23 = splitTwoMin3 + ":" + formatter.format(splitTwoSecs3);
		String split33 = splitThreeMin3 + ":" + formatter.format(splitThreeSecs3);
		String total3 = min33 + ":" + formatter.format(secs33);
		// Strings Runner Four
		String split14 = min4 + ":" + formatter.format(secs4);
		String split24 = splitTwoMin4 + ":" + formatter.format(splitTwoSecs4);
		String split34 = splitThreeMin4 + ":" + formatter.format(splitThreeSecs4);
		String total4 = min34 + ":" + formatter.format(secs34);
		// Strings Runner Five
		String split15 = min5 + ":" + formatter.format(secs5);
		String split25 = splitTwoMin5 + ":" + formatter.format(splitTwoSecs5);
		String split35 = splitThreeMin5 + ":" + formatter.format(splitThreeSecs5);
		String total5 = min35 + ":" + formatter.format(secs35);
		
		System.out.println("");
		System.out.println("*********************************************************************************");
		System.out.println("");
		System.out.printf("%34s ", "Runners Summary");
		System.out.println(" ");
		System.out.println("");
		System.out.printf("Runners %10s %10s %10s %8s", "Split 1", "Split 2", "Split 3", "Total");
		System.out.println("");
		System.out.printf("Runner 1 %10s %10s %10s %10s", split11, split21, split31, total1);
		System.out.println("");
		System.out.printf("Runner 2 %10s %10s %10s %10s", split12, split22, split32, total2);
		System.out.println("");
		System.out.printf("Runner 3 %10s %10s %10s %10s", split13, split23, split33, total3);
		System.out.println("");
		System.out.printf("Runner 4 %10s %10s %10s %10s", split14, split24, split34, total4);
		System.out.println("");
		System.out.printf("Runner 5 %10s %10s %10s %10s", split15, split25, split35, total5);

		scanner.close();
	}

}
