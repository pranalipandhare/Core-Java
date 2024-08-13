package com.practice1;

import java.util.Scanner;

public class SumdigitsScanner {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the number to Sum of the digits here....");
		int number= S.nextInt();
		int Sum = 0;
		
		while(number != 0) {
			Sum += number % 10;
			number /= 10;
		}
		
		System.out.println("Enter the sum of Digits: " + Sum);

	}

}
