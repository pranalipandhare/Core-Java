package com.practice;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		System.out.println("Enter the number of Elements from the array: ");

		int arr[] = new int[n];

		System.out.println("Enter the elements for the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		int smallest = 0;

		for (int i = 1; i < n; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		System.out.println("The smallest element of an array: " + smallest);
		s.close();
	}

}
