package StringBuilder;

public class StringBuilderCapacity {

	public static void main(String[] args) {
		
		//String Capacity and length
		
		StringBuilder s = new StringBuilder(50);
		s.append("Hello");
		System.out.println(s);
		System.out.println("Capacity: " + s.capacity());
		System.out.println("Length: " + s.length());

	}

}
