package com.class18;

public class Hello {
	
	
	void sayHello(String name) {
		
		System.out.println("Hello " +name);
	}

	public static void main(String[] args) {

		Hello obj=new Hello();
		obj.sayHello("asel");
		obj.sayHello("Waqqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Tyrkey");
		obj.sayHelloDifferentLanguage("Spain");
		
		
		obj.sayNameAndAge("john", 32);
		obj.sayNameAndAge("Asya", 26);
		
	}

	
	
	/*
	 * create a method will say hello in different language based 
	 * on the value that will be passed when user calls a methods 
	 *
	 */
	
	void sayHelloDifferentLanguage(String country) {
		
		
		switch(country.toLowerCase()){
			
	   case "usa":
				
			System.out.println("Hello");
			break;
	   case "russia":
		   System.out.println("Privet");
		   break;
		   
	   
	   case "albania":
		   System.out.println("Pershendjete");
		   break;
		   
		   default:
		   
			
			System.out.println("I do not know how to say hollo in your language");
			
		}
	}
 
	
	// method to say name and age 
	
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
		
		
		
	}
	
	// create a method 
	
	void isSnowing(boolean )
	
		
	}
	
