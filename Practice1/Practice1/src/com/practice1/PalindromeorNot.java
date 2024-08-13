package com.practice1;

public class PalindromeorNot {

	public static void main(String[] args) {
		
		int number = 12321;
		int N1 = number;
		int N2 = 0;
		
		
		while(number != 0) {
			int digit = number % 10;
			N2 = N2 * 10 + digit;
			number /= 10;
		}
		
		if(N1 == N2) {
			System.out.println("Given number is Palindrome");
		}else {
			System.out.println("Given number is not Palindrom");
		}
	}

}
