package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("**********************");
		
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1); //TRUE
		System.out.println(b2); //false
		System.out.println(b3); //true
		System.out.println("###################");
		
		
		
		int a=20;
		int c=30;
		//if number a is bigger than number b 
		// I want to print a is larger than b 
		
		if (a>c) {
			
			System.out.println("a is larger than c");
			
		}else{
			
			System.out.println("a is smaller than c");
			
			
			
		}
		
		int expectedHours=15;
		int actualHours=2;
		
		//if expected hours are more than actual -> you will succeed
		// otherwise, please study more 
		
		if(expectedHours>actualHours) {
			System.out.println("you will succeed");
		}else{
			System.out.println("please study more");
			
			
		}
				
		
	}

}
