package com.practice1;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String S = "Madam";
		boolean isPalindrome = true;
		
		S = S.toLowerCase();
		
		int length = S.length();
		
		for(int i = 0; i < length/2; i++) {
			if(S.charAt(i) != S.charAt(length - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is NOT Palindrome");
		}

	}

}
