package Exception_Handling;

import java.io.IOException;
import java.util.Scanner;

public class BufferReaderAndScanner_9 {
	public static void main(String[] args) throws IOException {

		// System.out.println("Enter a number");
		// int num=System.in.read();
		//
		// System.out.println(num);
		// System.out.println(num-48);

		System.out.println("Enter a number");

		// InputStreamReader in=new InputStreamReader(System.in);
		// BufferedReader bf=new BufferedReader(in);

		// int num=Integer.parseInt(bf.readLine());
		// System.out.println(num);
		// BufferedReader bf=new BufferedReader(null);
		// System.out.println(num-48);
		// _____ Bufer Reader Vs Scanner _____
		// Scanner class is the Advanace Class for Bufer Class

		// System.in means taking the input from KeyBoard
		// System.out means write on the console
		// Syste.err means show the error message in red colour
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
	}
}
