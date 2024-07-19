package StringBuilder;

public class BasicProgram {

	public static void main(String[] args) {
		// StringBuilder class in java is used to create mutable string objects, unlike
		// string, stringbuilder objects can be modified after created. This makes
		// stringbuilder more efficient than strings for concatanating multiple strings,
		// as it avoids creating multiple intermediate string objects.
		
		StringBuilder s = new StringBuilder("Hello");
		s.append("Good");
		s.append("Morning");
		
		String ss = s.toString();
		
		System.out.println();
		

	}

}
