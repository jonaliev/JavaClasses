package com.class18;

public class classRecap {

	 int student, teachers, classRooms;
	    String name, address, website;
	    
	    
	    void study() {
	        System.out.println("Students studying at " + name);
	        
	    }
	    void teach() {
	        System.out.println("Teachers teaching at " + name);
	        
	        
	    }
	    
	    
	    public static void main(String[] args) {
	    	
	    	
	        classRecap school = new classRecap();
	        school.name = "Syntax";
	        school.student = 200;
	        classRecap school1 = new classRecap();
	        
	        school1.name = "Pinnacle";
	        school1.student = 150;
	        
	        school1.teach();
	        school.study();

	
	
	    }
	

	}


