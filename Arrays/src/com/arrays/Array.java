package com.arrays;

import java.util.Arrays;

public class Array {

	// Find the Sum of All Elements in an Array

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("Sum of all Array: " + sum);

		System.out.println("------------------");

		//// Find the Sum of two array having same array length

		int array1[] = { 1, 2, 4, 5, 6 };
		int array2[] = { 3, 8, 7, 8, 7 };
		int[] sumArray = new int[array1.length];

		System.out.println("Sum of corresponding elements: ");
		for (int i = 0; i < array1.length; i++) {
			sumArray[i] = array1[i] + array2[i];
			System.out.println(sumArray[i]);
		}

		System.out.println("------------------");

		// Find the sum of array having different array length

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8 };

		int maxLength = Math.max(arr1.length, arr2.length); // [Math.max found the maximum length array]

		int[] sumofarray = new int[maxLength];

		System.out.print("Sum1 of corresponding elements: ");
		for (int i = 0; i < maxLength; i++) {
			int val1 = (i < arr1.length) ? arr1[i] : 0;
			int val2 = (i < arr2.length) ? arr2[i] : 0;
			sumofarray[i] = val1 + val2;
			System.out.print(sumofarray[i] + " ");
		}

		System.out.println("\n-----------------");

		// Find the Maximum Element in an Array

		int[] array3 = { 5, 7, 2, 8, 4 };

		int max = array3[0];

		for (int i = 1; i < array3.length; i++) {
			if (array3[i] > max) {
				max = array3[i];
			}
		}

		System.out.println("Maximum element in the array: " + max);
		System.out.println("-----------------");

		// Find the Minimum Element in an Array
		int array4[] = { 1, 2, 3, 4, 5 };
		int minimum = array[0];

		for (int i = 1; i < array4.length; i++) {
			if (array4[i] < minimum) {
				minimum = array4[i];
			}

		}
		System.out.println("Minimum element in the array: " + minimum);
		System.out.println("-----------------");

		// Reverse elements of an Array

		int array5[] = { 1, 2, 3, 4, 5 };
		int n = array5.length;

		for (int i = 0; i < n / 2; i++) {
			int temp = array5[i];
			array5[i] = array5[n - 1 - i];
			array5[n - 1 - i] = temp;
		}

		System.out.println("Reverse element array: " + Arrays.toString(array5));

		// Check if an Array Contains a Given Value
		System.out.println("-----------------");
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int givenvalue = 0;
		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == givenvalue) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Given value is from array");
		} else {
			System.out.println("Given value isnot from array");
		}

		System.out.println("-----------------");

		// Sort an Array in Ascending Order
		int ab[] = { 5, 2, 6, 4, 9 };
		Arrays.sort(ab);

		System.out.println("Array In ascending order: " + Arrays.toString(ab));

		// Duplicate elements from array
		int d1[] = { 1, 2, 3, 3, 5, 5, 8, 9 };
		int n1 = d1.length;
		int[] storeddata = new int[n];
		int aa = 0;

		// Sort an array in ascending order
		
		int arr[] = {1,5,76,2,656,12,46};
		Arrays.sort(arr);
		
		System.out.println("Given Array in the sorted Order: " + Arrays.toString(arr));
		

	}

}
