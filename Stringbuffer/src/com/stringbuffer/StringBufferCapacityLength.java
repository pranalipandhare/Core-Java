package com.stringbuffer;

public class StringBufferCapacityLength {

	public static void main(String[] args) {
		
		
		//create a stringbuffer object with initial capacity
		StringBuffer s = new StringBuffer(10);
		
		s.append("Pranali");
		System.out.println("Buffer: " + s);
		System.out.println("Capacity: " + s.capacity());
		System.out.println("Length: " + s.length());
		
		

	}

}
