package com.practice;

import java.util.Scanner;

public class SwaptheNumbers {

	public static void main(String[] args) {

		int A = 11;
		int B = 12;
		System.out.println("Before Swapping the numbers: " + A + " <=> " + B);

		int temp1 = A;
		A = B;
		B = temp1;
		System.out.println("After Swapping the numbers: " + A + " <=> " + B);
		
		System.out.println();
		System.out.println("*************************************");
		System.out.println();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the S1 number : ");
		int S1 = s.nextInt();
		System.out.println("Enter the S2 number: ");
		int S2 = s.nextInt();
		
		int S = S1;
		S1 = S2;
		S2 = S;
		System.out.println(" After the Swapping of given numbers: " + S1 + " < == >"+ S2);

	}

}
