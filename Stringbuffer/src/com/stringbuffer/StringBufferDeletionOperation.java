package com.stringbuffer;

public class StringBufferDeletionOperation {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer("Pranali GoodMorning");
		System.out.println(s);

		s.delete(0, 7);
		System.out.println("After deleting: " + s);

		s.deleteCharAt(3);
		System.out.println("After Deleting character: " + s);

	}
}
