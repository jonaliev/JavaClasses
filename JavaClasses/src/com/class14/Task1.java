package com.class14;

public class Task1 {

	public static void main(String[] args) {

		
	/*Create a String that will hold a sentence. Write a program to get a new String without any spaces.
	 * 
	 * Create a String that should be combination of letters, numbers and special characters. 
	 * Find out how many alpha characters are there in the String
	 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?” How would 
	 * you find out how many sentences are in that String?
	 */
	
		
		
		
		
		String str1="String that holds a sentences"; 
		
		System.out.println(str1.replaceAll(" ", ""));
		
		System.out.println("++++++++++++++++++++++++");
		
		String str2="JonAliev8788%$%^&*";
		String str3=(str2.replaceAll("[^a-zA-Z^]", ""));
		System.out.println(str3.length());
		
		
		System.out.println("*****************8");
		
		
		String str="Is it saturday? "
				+ "is it raining?,"
				+ " Do we have a java class today? ";
		
		String [] array1=str.split("",3);
		for (int i=0; i<array1.length; i++) {
			System.out.println(array1.length); 
		
		
		}
		
		
		
		
	}

}
