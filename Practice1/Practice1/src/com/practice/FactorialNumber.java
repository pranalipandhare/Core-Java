package com.practice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Factorial Number here .....!");
		int number = s.nextInt();

		int factorial = 1;
		System.out.print(number + "!" + " => ");

		for (int i = number; i > 0; i--) {
			factorial *= 1;
			System.out.print(i);

			if (i > 1) {
				System.out.print(" * ");
			}
		}	
			System.out.print(" = " + factorial);
			s.close();
		

	}

}
