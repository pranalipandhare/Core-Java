package com.practice;

import java.util.Scanner;

public class LargestElemet {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements of the array: ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		
		for(int i =0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int largest = 0;
		for(int i =1; i < n; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("The largest Element of the array: " + largest);
		s.close();
		
	}

}
