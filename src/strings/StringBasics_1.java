package strings;

public class StringBasics_1 {
	public static void main(String[] args) {
		// All Below String Methods , Created Object for a String
		String name = new String();
		String s2 = "irfan";
		String s3 = "pathan";
		String s4 = "Ayaan";
		String s5 = "Afsheen";
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println(name.length());
		System.out.println("hello " + name);
		System.out.println(name.concat("reddy"));
		System.out.println(name.getClass());
		System.out.println(name.getBytes());
		System.out.println(name.equals(s2));
		if (s2.equals(s3)) {
			System.out.println("Both String are Equa");

		} else {
			System.out.println("Strings are not Equal");
		}
		// String name="Navin";

	}
}