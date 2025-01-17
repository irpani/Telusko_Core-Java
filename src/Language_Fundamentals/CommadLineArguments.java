package Language_Fundamentals;

import java.util.Scanner;

public class CommadLineArguments {
	public static void main(String args[]) {
        //It takes the input from the System
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		 System.out.println("output of the Strings are ..");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		// System.out.println("Argument one = " + args[0]);
		// System.out.println("Argument two = " + args[1]);

	}
}