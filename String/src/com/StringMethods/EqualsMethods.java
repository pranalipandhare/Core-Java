package com.StringMethods;

public class EqualsMethods {

	public static void main(String[] args) {
		// Equals Method is used to compare content of two strings objects to determine
		// if they are equal.

		String s1 = "Hey";
		String s2 = "Hey";

		boolean result = s1.equals(s2);
		boolean result1 = s1 == s2;

		System.out.println("Given strings are equal or not: " + result);
		System.out.println("Given Strings are equal or not: " + result1);
	}
}
