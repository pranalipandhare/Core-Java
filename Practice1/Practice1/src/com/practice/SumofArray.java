package com.practice;

public class SumofArray {

	public static void main(String[] args) {

//		Sum of all the elements from the array[]
		
		int array[] = {1, 2, 3, 4, 5};
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("Sum of given array elements are " + sum);
		
		
//		Multiplication of al the elements from the B[]
		int B[] = {2,3,1,5,3};
		int multiplication = 1;
		
		for(int i = 0; i < B.length; i++) {
			multiplication *= B[i];
		}
	    System.out.println("Multiplication of all elements from the B[] " + multiplication);		
	}

}
