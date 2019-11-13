package com.class10;

public class TaskAnotherWay {
	
	
	
	//*Create an array of countries. 
	// * While retrieving all values from an array 
	// * print capital for each country.*/
	//public class TaskAnotherWay 
	
	
	public static void main(String[] args) {
		String[] countries = {"Afganistan","Colombia","USA","Turkey","Russia"};
		
		for (int i=0; i<countries.length; i++) {
			
			switch (countries[i]) {
			case"Afganistan":
				System.out.println("Kabul");
				break;
				
			case "Colombia":
				System.out.println("Bogoto");
				break;
			case"USA":
				System.out.println("Washington DC");
				break;
			case "Russia":
				System.out.println("Moscow");
				break;
				
				
			
			}
		}
		
		
		
		
	}




}
