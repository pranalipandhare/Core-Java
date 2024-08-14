package comlist;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {

		// Create an ArrayList to hold integer elements

		ArrayList<Integer> arraylist = new ArrayList<>();
		
		arraylist.add(12);
		arraylist.add(13);
		arraylist.add(14);
		arraylist.add(15);
		arraylist.add(16);

		System.out.println("List of the Elements in the Array: " + arraylist);
		System.out.println();
		
		System.out.println("The Element from the Array: " + arraylist.get(2));
		System.out.println();
		
		System.out.println("Remove ELement from the Array: " + arraylist.remove(0));
		System.out.println();
		
		System.out.println("After removing the element from the array: " + arraylist);
		System.out.println();

	}

}
