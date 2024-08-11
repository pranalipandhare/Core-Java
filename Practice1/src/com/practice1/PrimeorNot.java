package com.practice1;

import java.util.Scanner;

public class PrimeorNot {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number here...");
		int n = s.nextInt();
		boolean isPrime = true;
		
		if(n <= 1) {
			isPrime = false;
		}else {
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n%i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if(isPrime) {
			System.out.println(n + " It is Prime number");
		}else {
			System.out.println(n + " It is not Prime number");
		}
	}

}
