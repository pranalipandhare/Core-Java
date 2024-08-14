package comlist;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
	
		// Create an ArrayList to hold String elements
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("Pranali");
		array.add("Runali");
		array.add("Yogita");
		array.add("Sakshi");
		array.add("Anisha");
		
		System.out.println("String ArrayList " + array);
		System.out.println();
		
		System.out.println("String ArrayList one string: " + array.get(0));
		System.out.println();
		
		System.out.println("Remove one string element: " + array.remove(3));
		System.out.println();
		
		System.out.println("After removing elements from the String arrayList: " + array);
		
	}

}
