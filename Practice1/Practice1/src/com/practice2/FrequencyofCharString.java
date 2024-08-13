package com.practice2;

import java.util.Scanner;

public class FrequencyofCharString {

	public static void main(String[] args) {

		// frequncy => How many times one character is repeat 
		String s = "Pranali Pandhare";
		char r = 'a';

		int frequency = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == r) {
				frequency++;
			}
		}
		System.out.println("frequency of the " + r + " is " + frequency);
		
		
		
	}

}
