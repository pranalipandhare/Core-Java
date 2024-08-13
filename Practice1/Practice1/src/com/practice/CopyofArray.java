package com.practice;

public class CopyofArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		System.out.print("Array b[] after copying array a[]: ");
		
		for(int i = 0; i < b.length; i++) {
			System.out.print( b[i] + " ");
		}
	}

}
