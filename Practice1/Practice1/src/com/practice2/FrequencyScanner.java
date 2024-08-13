package com.practice2;

import java.util.Scanner;

public class FrequencyScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the String Here...!");
		String str = s.nextLine();

		System.out.println("Enter the character to find the frequencey: ");
		char r = s.next().charAt(0);
		
		str = str.toLowerCase();
		r = Character.toLowerCase(r);

		int frequency = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == r) {
				frequency++;
			}
		}
		System.out.println("Frequncy of the given character is " + frequency);

	}

}
