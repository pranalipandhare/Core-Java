package com.StringMethods;

public class SubStringMethod {

	public static void main(String[] args) {
		// substring method is used to extract part of the string
		// There are two variant substrings: substring(eginindex, endindex)

		String s = " Hey Good night";
		
		String substr = s.substring(4);
		String substr1 = s.substring(0,4);
		System.out.println("String from the given index: " + substr);
		System.out.println("String from the given index: " + substr1);
	}

}
