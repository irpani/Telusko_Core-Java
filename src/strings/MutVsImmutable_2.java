package strings;

public class MutVsImmutable_2 {
	public static void main(String[] args) {
		String name = "navin";
		name = name + "reddy";
		System.out.println("hello" + name);

		String s1 = "Navin";
		String s2 = "Naveen";

		System.out.println("Comaring 2 Strings :" + (s1 == s2));

	}
}