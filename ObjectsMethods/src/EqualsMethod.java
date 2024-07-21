import java.util.Objects;

public class EqualsMethod {

	public static void main(String[] args) {
		        String str1 = "Hello";
		        String str2 = null;

		        // Check equality
		        boolean areEqual = Objects.equals(str1, str2);
		        System.out.println("Are equal: " + areEqual);

		        // Hash code
		        int hash = Objects.hashCode(str1);
		        System.out.println("Hash code: " + hash);

		        // ToString
		        String strRepresentation = Objects.toString(str2, "Default String");
		        System.out.println("String representation: " + strRepresentation);

		        // Require non-null
		        try {
		            Objects.requireNonNull(str2, "str2 must not be null");
		        } catch (NullPointerException e) {
		            System.out.println(e.getMessage());
		        }

		        // Check if null
		        boolean isNull = Objects.isNull(str2);
		        System.out.println("Is null: " + isNull);

	}

}
