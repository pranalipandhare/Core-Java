package com.practice1;

import java.util.Arrays;

public class RevArrByMethod {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 5, 6 };
		System.out.println("Original Array : " + Arrays.toString(arr));
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		call the reverse method
		reverseArray(arr);
		System.out.println();
		System.out.println("Revresed Array " + Arrays.toString(arr));

	}

	private static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}

	}

}
