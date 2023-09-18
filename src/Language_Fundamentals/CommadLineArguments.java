package Language_Fundamentals;

import java.util.Scanner;

public class CommadLineArguments {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(str1);
		System.out.println(str2);

		// System.out.println("Argument one = " + args[0]);
		// System.out.println("Argument two = " + args[1]);

	}
}