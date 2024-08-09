package com.practice;

import java.util.Scanner;

public class VowelorNot {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Character: " );
		char S1 = S.next().charAt(0);
		
		S1 = Character.toLowerCase(S1);
		
		if(S1 == 'a' || S1 =='e' || S1 == 'i' || S1 == 'o' || S1 == 'u') {
			System.out.println("Given Character is not Vowel");
		}else {
			System.out.println("Given Character is Vowel");
		}
	}

}
