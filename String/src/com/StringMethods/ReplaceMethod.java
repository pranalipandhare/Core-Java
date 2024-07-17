package com.StringMethods;

public class ReplaceMethod {

	public static void main(String[] args) {
		// Replace method is used to replace all occurance of the specified charactor
		// and sequence of charactor in a string with another charactor 

		String s = "Hey Good Night";
		
		String r = s.replace("e","y");
		String R = s.replace("Hey", "Hello");
		
		System.out.println("Replace character from the given string: " + r);
		System.out.println("Replace character from the given string: " + R);

	}

}
