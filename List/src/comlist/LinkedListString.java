package comlist;

import java.util.LinkedList;

public class LinkedListString {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Apple");
		linkedlist.add("Orange");
		linkedlist.add("Banana");
		linkedlist.add("Mango");
		linkedlist.add("Kivi");
		linkedlist.add("Peru");
		
		System.out.println("String Linked List: " + linkedlist);
		System.out.println();
		
		System.out.println("String linked list accessing index: " + linkedlist.get(4));
		System.out.println();
		
		System.out.println("String linked List removing element: " + linkedlist.remove(5));
		System.out.println();
		
		System.out.println("After removing String linked List: " + linkedlist);
	}

}
