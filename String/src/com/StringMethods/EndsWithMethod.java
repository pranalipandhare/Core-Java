package com.StringMethods;

public class EndsWithMethod {

	public static void main(String[] args) {
		// Endswith is used to check string is ends with specified suffix or not. It
		// returns in boolean values true or false
		
		String s = " Hey Bunny What's up..!";
		String suffix = "up";
		
		boolean result = s.endsWith(suffix);
		
		System.out.println("Suffix is ends with given suffix or not: " + result);
		

	}

}
