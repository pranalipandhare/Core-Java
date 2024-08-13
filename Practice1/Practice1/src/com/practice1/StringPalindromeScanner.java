package com.practice1;

import java.util.Scanner;

public class StringPalindromeScanner {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the String Here to check the Palindrome...");
		String string = S.nextLine();
		boolean isPalindrome = true;

		string = string.toLowerCase();

		int length = string.length();

		for (int i = 0; i < length / 2; i++) {
			if (string.charAt(i) != string.charAt(length - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("Entered String is Palindrome");
		} else {
			System.out.println("Entered String is NOT Palindrome");
		}

	}
}
