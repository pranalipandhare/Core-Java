package com.practice;

import java.util.Scanner;

public class Consonentornot {

	public static void main(String[] args) {
//		To write a code to check Whether the Character is Vowel or Consonant

		char c = 'C';

		if ((c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				&& (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
			System.out.println("Given charactor is consonent");
		} else {
			System.out.println("Given charactor is not consonent");
		}

		System.out.println();
		System.out.println("*************************");
		System.out.println();
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Charactor: ");
		char c1 = S.next().charAt(0);
		
		if ((c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U')
				&& (c1 == 'A' || c1 == 'E' || c1 == 'I' || c1 == 'O' || c1 == 'U')) {
			System.out.println("Given charactor is consonent");
		} else {
			System.out.println("Given charactor is not consonent");
		}

	}

}
