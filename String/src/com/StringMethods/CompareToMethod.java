package com.StringMethods;

public class CompareToMethod {

	public static void main(String[] args) {

		// Compareto method is used to compare two strings, It returns an integer that
		// indicates the relationship between two string
		// Strings compared on the basis of alphabetical order of their characters and one charactor at a time and left to right 
		String s1 = "Runali";
		String s2 = "Pranali";
		
		int result = s1.compareTo(s2);
		
		System.out.println("Comparing " + s1 + " with " + s2 + " : " + result);

	}

}
