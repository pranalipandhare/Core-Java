package com.interfac;

interface animals{
	 void makesound();
	// abstract method - no body, no implementation, inherit by all subclasses
	// void - do not return any value, () - do not return any argument	
	 default void sleep() {
	 		System.out.println("This animal is sleeping");
	} 
}

class Cats implements animals{
	@Override
	
	public void makesound() {
		System.out.println("Meow-Meow");
		
	}
}

public class Default_method_Interface {
	
	public static void main(String[] args) {
		animals a5 = new Cats();
		
		a5.sleep();
		a5.makesound();	
	}
}
