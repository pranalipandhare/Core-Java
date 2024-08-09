package com.practice;

import java.util.Scanner;

public class VowelorConsonent {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Character here....! ");
		char S = s.next().charAt(0);
		
		S = Character.toLowerCase(S);
		
	    if(S == 'a' || S == 'i' || S == 'e' || S == 'o' || S == 'u') {
	    	System.out.println("Entered Character is Consonent");
	    }else {
	    	System.out.println("Entered Character is Vowel");
	    }
	    
	    System.out.println();
	    System.out.println("Thank You..!");

	}

}
