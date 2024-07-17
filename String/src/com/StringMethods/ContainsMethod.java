package com.StringMethods;

public class ContainsMethod {

	public static void main(String[] args) {
		// Contains method in java is used to check is sequesce of charactors(substring)
		// is present within a string
		// It returns a boolean value 'true' if the substring is found, and 'false'
		// otherwise.

		String s = "Hey Good Morning Pranali";
		String s1 = "Hey";
		String s2 = "Evening";

		boolean result = s.contains(s1);
		boolean result1 = s.contains(s2);

		System.out.println("Does s contains s1 or not: " + result);
		System.out.println("Does s contains s2 or nor: " + result1);

	}

}
