package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		// 4 + 7 ; 4 and 7 = operands, + = operator, 4 + 7 is a mathematical expression -- > evaluates number which is an *int/double*
		// Logical operator = "<"less than ">"greater than "<="less than or equal to ">="greater than or equal to "==" equals "!=" not equals. 4 < 3 is a logical expression. They evaluate to a *Boolean* which is True/False
		// Primitive types = int, double,  char,  boolean

		//int age = 17;
		//double height = 123.5;
		
		//(age >= 17)&&(height < 150); && joins them. && is AND. This is a true statement. && must be TRUE
		
		//int age = 13;
		//int height = 145;
		
		//(age >= 17)&&(height < 150); && joins them . This is a False Statement. 
		
		//(age >= 17) || (height < 150); || is OR. its one or the other .If one is true the whole thing is true. This is a True Statement
		
		// !(age >= 17) && (height < 150); The ! is not. It's the exact opposite. !(age >= 17) is the same as (age < 17)
		
		/*if (boolean expression){
			-----
			---
			----
			
		}
		else if (boolean expression){
			------
			------
			------
		}
		*/
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a numerical grade: ");
		int grade = scanner.nextInt();

		if (grade >= 80) {
			System.out.println('A');
		} else if (grade >= 70) {
			System.out.println('B');
		} else if (grade >= 60) {
			System.out.println('C');
		} else if (grade >= 50) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}

		System.out.println("---Done---");
	}

}
