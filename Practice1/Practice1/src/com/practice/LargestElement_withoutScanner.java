package com.practice;

public class LargestElement_withoutScanner {

	public static void main(String[] args) {

		int arr[] = { 3, 6, 7, 2, 5 };
		int largest = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println("Enter the Largest element from the given array: " + largest);

	}

}
