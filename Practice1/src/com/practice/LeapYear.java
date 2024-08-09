package com.practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int year = 2000;
		// if year is laep then it is divisible by 4 & not divisible by 100
		// or it is also divisible by the 400

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is not leap year");
		} else {
			System.out.println(year + " is leap year");
		}

		System.out.println();
		System.out.println("*************************************");
		System.out.println();

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year to check Leap Year: - ");
		int Year = s.nextInt();

		if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
			System.out.println("Given Year is Leap Year");
		} else {
			System.out.println("Given Year is Not Leap Year");
		}

	}

}
