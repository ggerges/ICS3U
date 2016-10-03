package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BvgPools {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double length,width, transition, lengthShallow, lengthDeep, liner1,liner2,liner3,shallow,deep; 
		
		System.out.print("Please enter the Width of the Pool : ");
		width = keyboard.nextDouble();
		
		System.out.print("Please enter the Length of the Pool : ");
		length = keyboard.nextDouble();
		
		System.out.println("---------------------------------------");
		
		System.out.print("Please enter the depth of the shallow end of the Pool : ");
		shallow = keyboard.nextDouble();
		
		System.out.print("Please enter the depth of the deep end of the Pool : ");
		deep = keyboard.nextDouble();
		
		System.out.print("Please enter the legnth of the 'Transition' between the shallow and the deep end : ");
		transition = keyboard.nextDouble();
		
		System.out.print("Please enter the legnth of the shallow end : ");
		lengthShallow = keyboard.nextDouble();
		
		lengthDeep = length - lengthShallow;
		
		System.out.print("Please enter the price for the first liner : ");
		liner1 = keyboard.nextDouble();
		
		System.out.print("Please enter the price for the Second liner : ");
		liner2 = keyboard.nextDouble();
		
		System.out.print("Please enter the price for the Third liner : ");
		liner3 = keyboard.nextDouble();
		//-------------------------------------------------------------------------
		double slantHeight, slantVolume,slantWidth,Volume, poolOne, poolTwo, poolOneLength;
		slantHeight = deep - shallow;
		slantWidth = Math.sqrt((slantHeight*slantHeight) + (transition*transition));
		slantVolume = 0.5 * slantHeight * slantWidth * width ;
		
		poolOneLength = length - lengthShallow;
		poolOne = poolOneLength * shallow * width;
		
		poolTwo = lengthDeep * slantHeight * width;
	
		Volume = slantVolume * poolOne * poolTwo ;
		Volume = (int)(Volume/100);
		Volume = (double)(Volume/10);
		
		System.out.println("the amount of water needed to keep the pool %90 full is " + Volume + "L.");
		
		double surfaceArea1, surfaceArea2, surfaceArea3, surfaceArea; 
		
		surfaceArea1 = 2 * (width*length + shallow*length + shallow*width);
		surfaceArea2 = 2 * (slantHeight*lengthDeep + deep*lengthDeep + deep*slantHeight);
		surfaceArea3 = 2 * (deep*slantWidth + slantHeight* slantWidth + slantHeight*deep);
		surfaceArea = surfaceArea1 + surfaceArea2 + surfaceArea3;
		surfaceArea = (int)(surfaceArea/100);
		surfaceArea = (double)(surfaceArea/10);
		System.out.println("You will need " + surfaceArea + "cm^2 of liner to cover the pool");
		
		double priceLiner1, priceLiner2, priceLiner3;
		
		priceLiner1 = liner1 * surfaceArea;
		priceLiner1 = (int)(priceLiner1/100);
		priceLiner1 = (double)(priceLiner1/10);
		
		
		priceLiner2 = liner2 * surfaceArea;
		priceLiner2 = (int)(priceLiner2/100);
		priceLiner2 = (double)(priceLiner2/10);
		
		priceLiner3 = liner3 * surfaceArea;
		priceLiner3 = (int)(priceLiner3/100);
		priceLiner3 = (double)(priceLiner3/10);
		
		System.out.println("The price for liner1 is " + priceLiner1 + "$");
		System.out.println("The price for liner2 is " + priceLiner2 + "$");
		System.out.println("The price for liner3 is " + priceLiner3 + "$");
		
		

	}

}
