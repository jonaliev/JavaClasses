package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {

		//how to separated comma delimited string.
		
		
		String str="If you come to class eartly, "
				+ "than you can study more, also you can learn more,"
				+ "and you can leave early";
		
		String[] array=str.split(",");
				
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
			
		}
		System.out.println("---------------");
		
		String str1="Welcome To Syntax Technologies";
		String[] array2=str1.split( ", 3");					
		str1.split(" ",2);
		System.out.println(array2.length);
		
	for (int i=0; i<array2.length; i++) {
		
		System.out.println(array2[i]);
		
	}
	}

}
