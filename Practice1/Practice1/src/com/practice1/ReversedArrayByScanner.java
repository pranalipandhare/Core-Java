package com.practice1;

import java.util.Scanner;

public class ReversedArrayByScanner {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Size of the array here...!");
		int size = S.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter the Array elements Here..!");
		
		for(int i = 0; i < size; i++) {
			array[i] = S.nextInt();
		}

		for(int i = 0; i < size/2; i++) {
			int temp = array[i];
			array[i] = array[size - i - 1];
			array[size - i - 1] = temp;
		}
		System.out.println("Reversed Array elements: ");
		
		for(int i = 0; i < size; i++) {
			System.out.println(array[i] + " ");
		}
		
	}

}
