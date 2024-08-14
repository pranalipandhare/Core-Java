package comlist;

import java.util.Vector;

public class VectorString {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("Marigold");
		vector.add("Lilly");
		vector.add("Rose");
		vector.add("Lotus");
		vector.add("Jasmin");
		
		System.out.println("Vector List: " + vector);
		System.out.println();
		
		System.out.println("Getting the Element in vector by accessing index: " + vector.get(2));
		System.out.println();
		
		System.out.println("Remove the Element from vector: " + vector.remove(0));
		System.out.println();
		
		System.out.println("After removing the Element from vector: " + vector);
	}

}
