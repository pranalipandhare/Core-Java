package com.practice1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
//		The Fibonacci series (or Fibonacci sequence) is a sequence of numbers 
//		where each number after the first two is the sum of the two preceding ones
//		Fibonacci series start from 0 and 1
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Fibonacci Series Here...!");
		int n = s.nextInt();

		int n1 = 0;
		int n2 = 1;

//		System.out.println("Fibonacci series up to " + n + ": ");
		System.out.println(n1 + " ");
		System.out.println(n2 + " ");

		for (int i = 2; i < n; i++) {
			int next = n1 + n2;
			System.out.println(next + " ");
			n1 = n2;
			n2 = next;
		}

	}

}
