package StringBuilder;

public class StringBuilderOperations {

	public static void main(String[] args) {
		//

		// Inserting

		StringBuilder ss = new StringBuilder("Hey");
		ss.insert(3, "Morning");
		String result = ss.toString();
		System.out.println("Inserting: " + result);

		// Deleting
		StringBuilder s1 = new StringBuilder("Heyy Good Morning");
		s1.delete(4, 9);
		String res = s1.toString();
		System.out.println("Deleteing: " + res);

		// Replacing
		StringBuilder s2 = new StringBuilder("Hey Pretty girl");
		s2.replace(4, 10, "ugly");
		String res1 = s2.toString();
		System.out.println("Replacing: " + res1);

		// Reversing
		StringBuilder s3 = new StringBuilder("Hey Beautiful");
		s3.reverse();
		String res2 =  s3.toString();
		System.out.println("Reversing the String: " + res2);

	}

}
