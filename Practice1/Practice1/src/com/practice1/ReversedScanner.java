package com.practice1;

import java.util.Scanner;

public class ReversedScanner {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Numbers here...!");
		int num = S.nextInt();
		int reversed = 0;
		
		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		
		System.out.println("Reversed Number: " + reversed);

	}

}
