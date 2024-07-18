package com.stringbuffer;

public class StringBufferOperations {

	public static void main(String[] args) {
		// StringBuffer is a class which is used to modifiable strings, which is used
		// when you need to make many channges to a string.
		// It avoid creating multiple immutable strings
		
		StringBuffer s = new StringBuffer("Hello");
		
		//To apend string to buffer
		s.append(" Good Morning");
		System.out.println("After appending: " + s);
		
		//To insert at a specified position
		s.insert(6, "Hey ");
		System.out.println("After inserting: " + s);
		
		//Delete the portion of the string
		s.delete(0, 6);
		System.out.println("After Deleting: " + s);
		
		//Replace the portion of the String
		s.replace(0, 2, "Heyyy");
		System.out.println("After Replacing: " + s);
		
		//Reverse the string
		s.reverse();
		System.out.println("After Reversing: " + s);
	}

}
