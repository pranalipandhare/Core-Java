package com.practice2;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int A[] = {1,2,3};
		int B[] = {4,5,6};
		
		int length1 = A.length;
		int length2 = B.length;
		
		int C[] =  new int[length1 + length2];
		
		for(int i = 0; i < length1; i++) {
			C[i] = A[i];
		}
		
		for(int i = 0; i < length2; i++) {
			C[length1 + i] = B[i];
		}
		
		System.out.print("Merged Array: ");
		
		for(int i = 0; i < C.length; i++) {
			System.out.print(C[i] + " ");
		}
		

	}

}
