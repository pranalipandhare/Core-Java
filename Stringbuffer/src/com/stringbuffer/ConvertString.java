package com.stringbuffer;

public class ConvertString {

	public static void main(String[] args) {
		// Convert String to Stringbbuffer
		String s = "Pranali";
		StringBuffer ss = new StringBuffer(s);
		System.out.println("StringBuffer: " + s);

		// Convert StringBuffer to string
		String sss = s.toString();
		System.out.println("String: " + sss);

	}
}
