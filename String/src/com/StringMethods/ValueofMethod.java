package com.StringMethods;

public class ValueofMethod {

	public static void main(String[] args) {
		// String.valueof Method is static method that returns the string representation of
		// various data types and objects. It can be used in many different kind of
		// context like with primitive datatypes, with char array, with objects, combing
		// different data types into single string

		// Using valueOf with different primitive data types
		boolean boolValue = true;
		char charValue = 'A';
		int intValue = 100;
		long longValue = 100000L;
		float floatValue = 10.5f;
		double doubleValue = 99.99;

		// Converting to String using String.valueOf()
		String boolStr = String.valueOf(boolValue);
		String charStr = String.valueOf(charValue);
		String intStr = String.valueOf(intValue);
		String longStr = String.valueOf(longValue);
		String floatStr = String.valueOf(floatValue);
		String doubleStr = String.valueOf(doubleValue);

		// Displaying the results
		System.out.println("Boolean to String: " + boolStr);
		System.out.println("Char to String: " + charStr);
		System.out.println("Int to String: " + intStr);
		System.out.println("Long to String: " + longStr);
		System.out.println("Float to String: " + floatStr);
		System.out.println("Double to String: " + doubleStr);
	}

}
