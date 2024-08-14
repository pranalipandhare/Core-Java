package comlist;

import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();
		vector.add(19);
		vector.add(29);
		vector.add(39);

		System.out.println("List of vector: " + vector);
		System.out.println();
		System.out.println("Vector list of elements by index: " + vector.get(0));
		System.out.println();
		System.out.println("vector list after removing element: " + vector.remove(0));
		System.out.println();
		System.out.println("After removing the elements from the vector element: " + vector);

	}

}
