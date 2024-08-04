package com.number;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    Random random = new Random();
	    
	    int MaxAttempt = 5;
	    int round = 1;
	    int totalscore = 0;
	    
	    while(true) {
	    	int NumtoGuess = random.nextInt(100) + 1;
	    	int attempts = 0;
	    	boolean hasguessCorrectly = false;
	    	
	    	System.out.println("Round" + round + " : Guess the Number between the 1 to 100");
	    	
	    	while(attempts < MaxAttempt && !hasguessCorrectly) {
	    		System.out.println("Enter the guess number: ");
	    		int userGuess = scanner.nextInt();
	    		attempts++;
	    		
	    		if(userGuess < NumtoGuess) {
	    			System.out.println("Too Low");
	    		} else if(userGuess > NumtoGuess){
	    			System.out.println("Too High");
	    		}else {
	    			System.out.println("Congratulations..! You Won");
	    			hasguessCorrectly =  true;
	    			int score = MaxAttempt - attempts + 1;
	    			totalscore += score;
	    			System.out.println("You scored" + score + " Points");
	    		}
	    	}
	    	
	    	if(!hasguessCorrectly) {
	    		System.out.println("SORRY ! you've used all your attempts. The number was " + NumtoGuess);
	    	}
	    	System.out.println("Total score: " + totalscore);
	    	
	    	System.out.println("Do you want to play another round? Y/N");
	    	String response = scanner.next();
	    	if(response.equalsIgnoreCase("No")) {
	    		break;
	    	}
	    	round++;    	
	    }
	    scanner.close();
        System.out.println("Thank you for playing! Final Score: " + totalscore);

	}

}
