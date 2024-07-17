package com.StringMethods;

public class StartswithMethod {

	public static void main(String[] args) {
		// Startswith method is used to check it the string is startswith specified
		// prefix or not. It returns in boolean value tru or false

		String s = "Mrs. Pranali Pandhare";
		String p = "Mrs";

		boolean result = s.startsWith(p);

		System.out.println("Prefix starts with string or not: " + result);
	}

}
