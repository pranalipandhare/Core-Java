package com.StringMethods;

public class ReverseStringMethod {

	public static void main(String[] args) {
		
		String s = "Pranali";
		String r = reverseString(s); // reverseString method is used 
		System.out.println("Original String: " + s);
		System.out.println("Reversed String: " + r);
	}
	
// create method of reverseString(String s)
	public static String reverseString(String s) {
		char[] charArray = s.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		
		while(left < right){
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			
			left++;
			right--;
		}
		return new String(charArray);
	}

	
}
