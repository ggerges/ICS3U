package com.bayviewglen.dayone;

import java.text.DecimalFormat;

public class exercises {
	
 else if (input.equals("2")){
   
    for (int j = 0; j <= word.length()-1; j++) {
          if(guessLetter.equalsIgnoreCase("" + word.charAt(j)) && !guessLetter.equalsIgnoreCase("" + displayWord.charAt(j))){
                numOfTotalPointsP1++;
                numOfPoints--;
                i--;
                System.out.println("Congrulations! You got 1 point. Your number of points is "+ numOfTotalPointsP1);
                break;
          }
          else if (j == word.length() - 1){
                numOfPoints--;
                System.out.println("Unfortunatly, you have not acquired any points. Your number of points is"+ numOfTotalPointsP1);
          }
    }

	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.print(CubeRoots());

	}
	public static String CubeRoots(){
	
		int num = 10;
		String str = " ";
		for(int i = 0; i<=40; i++){
			double numToPrint = Math.sqrt(Math.pow(num, 3));
			str += (num  + " " + numToPrint + " ");
			
			num ++;
			
			}
		
		return str;
	}

}

