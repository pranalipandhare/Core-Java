package comlist;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedlist = new LinkedList<>();
		
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		
		System.out.println("LinkedList elements: " + linkedlist);
		System.out.println();
		
		System.out.println("Get one Element from the Linkedlist elements: " + linkedlist.get(3));
		System.out.println();
		
		System.out.println("Remove one element from the linkedlist elements: " + linkedlist.remove(4));
		System.out.println();
		
		System.out.println("Show the All elements from the Linkedlist elements: " + linkedlist);
	}

}
