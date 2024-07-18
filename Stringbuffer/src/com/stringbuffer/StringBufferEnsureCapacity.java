package com.stringbuffer;

public class StringBufferEnsureCapacity {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer(5);
		System.out.println("Initial Capacity: " + s);
		
		s.ensureCapacity(20);
		System.out.println("Capacity after ensuring: " + s);

		s.append("Hey Morning..!");
		System.out.println("Capacity: " + s.capacity());
		System.out.println("Length: " + s.length());
	}

}
