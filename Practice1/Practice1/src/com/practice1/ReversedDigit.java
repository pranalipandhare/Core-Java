package com.practice1;

public class ReversedDigit {

	public static void main(String[] args) {
		
		int Num = 12345;
		int reversed = 0;
		
		while(Num != 0) {
			int digit = Num % 10;
			reversed = reversed * 10 + digit;
			Num /= 10;
		}
		
		System.out.println("Reversed Number " + reversed);

	}

}
