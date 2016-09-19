package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {
		double won, lost, total, percentage;
		won = 110;
		lost= 44;
		total = (double)(won + lost);
		percentage = (won / total)* 100;
		percentage = (int)(percentage * 1000);
		percentage = (double)(percentage / 1000);
		System.out.println("Out of " + (int) total + " games, The Yankees won " + (int)won + " games and lost " + (int)lost + " games. Their winning percentage is " + percentage + ".");

	}

}
