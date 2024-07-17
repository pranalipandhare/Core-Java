package com.StringMethods;

public class HashcodeMethod {

	public static void main(String[] args) {

		// Hashcode method in the string class returns a hashcode for the string.
		// This hash code is computed based on the contents of the string and is
		// typically used in hash-based data structures like HashMap, HashSet
		// hashcode: it returns an integer hash code value for an object.
		String s = "Hello";
		
		int h = s.hashCode();
		
		System.out.println("Hashcode of given string: " + h);

	}

}
