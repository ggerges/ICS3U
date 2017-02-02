package com.bayviewglen.dayone;

public class test {
	public static void main(String[] args){
	int total = 0, num = 0;	
	while(num<100){
		total+=num;
		if(num<50)
			num+=10;
	}
		
	}
	
	public static void printChars(String str, int num){
		if (num%2 == 0){
			printLine(str,num);
			printLine(str+str.substring(0,1), num);
		}
		else{
			printLine(str+str.substring(0,1), num+1);
			printLine(str+str.substring(0,2), num+1);
		}
	}
	public static void printLine(String str, int num){
		for(int i =1; i<=num; i++){
			System.out.print(str + " ");
		}
		System.out.println("");
	}
}
