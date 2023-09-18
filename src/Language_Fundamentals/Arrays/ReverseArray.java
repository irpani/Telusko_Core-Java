package Language_Fundamentals.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 9, 7, 5 };
		for (int i = a.length; i > 0; i--) {
			System.out.println(a[i - 1]);
		}

	}

}
