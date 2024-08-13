package com.practice1;

public class ReversedArray {

	public static void main(String[] args) {
		
		int arr[] = {2, 4, 6, 5};
		
		System.out.print("Original Array: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print( + arr[i] + " ");
		}
		
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println();
		
		System.out.print("Reversed Array: " );
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
