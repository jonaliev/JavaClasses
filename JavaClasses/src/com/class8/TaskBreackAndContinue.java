package com.class8;

import java.util.Scanner;

public class TaskBreackAndContinue {
	
	public static void main(String[]args) {
		
		for (int a=1; a<=50; a++) {
			if(a%3==0) {
				continue;
				
			}
			System.out.print(a+ " "); 
			
		}
		
		Scanner scan=new Scanner (System.in);
		
		for(int c=1; c<=10;c++) {
			System.out.println("Do you want to apply for credit card?");
			
			String word=scan.nextLine();
			if(word.contentEquals("yes")) {
				break;
				
			}
			
		} 
		}
	
	{
		
		
	}

}
