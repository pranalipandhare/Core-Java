package com.practice1;

import java.util.Scanner;

public class PalindromeByScanner {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Write Palindrome number here..!");
		int number = S.nextInt();
		int N1 = number;
		int N2 = 0; 
		
		while(number != 0) {
			int digit = number % 10;
			N2 = N2 * 10 + digit;
			number /= 10;
		}
		
		if(N1 == N2) {
			System.out.println("Given numbers are Palindrome");
		}else {
			System.out.println("Given numbers are not Palindrome");
		}
		

	}

}
