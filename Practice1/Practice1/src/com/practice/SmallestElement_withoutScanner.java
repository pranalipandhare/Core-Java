package com.practice;

public class SmallestElement_withoutScanner {

	public static void main(String[] args) {
		
		int arr[] = {4,6,2,1,5,9};
		int smallest = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Smallest elements from the Given Array " + smallest);

	}

}
