package com.class18;

public class Task1 {

	
	void isLarger(int a, int b) {
		
		if (a>b) {
		System.out.println("The number "+a +" is larger then number " +b);
		
		}else if (a<b) {
			System.out.println("The number "+a +" is smaller then number " +b);
			
		}else if (a==b) {
			System.out.println("The number "+a +" is equal to then number " +b);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		
		obj.isLarger(6,8);
		obj.isLarger(4,  4);
		obj.isLarger(8, 2);
		
		obj.isEvenOrOdd(6);
		obj.isEvenOrOdd(9);
		
		obj.isPalindrome("hello");
		obj.isPalindrome("madam");

	}

	
void isEvenOrOdd(int a) {
		
		if (a%2==0) {
		System.out.println("The number "+a +" is even");
		
		}else if (a%2!=0) {
			System.out.println("The number "+a +" is odd");
			
			
		}
		

	
}

       void isPalindrome(String word) {
	
	String reverse= "";
	for(int i=word.length() -1; i>=0; i--) {
		
		reverse=reverse+word.charAt(i);
		
	}
	
	if (word.contentEquals(reverse)) {
		System.out.println("The string is a palindrome ");
	}else { 
		System.out.println("The string is NOT a polindrome");
		
		
		
	
		
	}
}




}
