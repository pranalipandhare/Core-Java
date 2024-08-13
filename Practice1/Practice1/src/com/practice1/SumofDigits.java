package com.practice1;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
			
		int s = 1234567;
		int sum = 0;
		
		while(s != 0) {
			sum += s % 10;
			s /= 10;
		}

		System.out.println("Enter the sum of digits: " + sum);
			
	}

}
