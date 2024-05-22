package Language_Fundamentals;

import java.util.Scanner;

public class DemoApp {

	public void sayHello(String uname) {
		System.out.println("DemoApp.sayHellow()");
		for (int i = 0; i < 10; i++) {
			System.out.println("uname :" + i);
		}

		System.out.println("End of sayhello()");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter message");
		String msg = sc.next();
		displayMsg(msg);

	}

	public void displayMsg(String msg) {
		System.out.println("Demoapp.dispalyMsg()" + msg);
		System.out.println("Demoapp.dispalyMsg()" + msg);
		printNumber(10);
	}

	public void printNumber(int n) {
		System.out.println("print the number");
		for (int j = 0; j < n; j++) {

		}
	}

	public int add(int a, int b) {

		int c = a + b;
		System.out.println("addition is " + c);
		return c;

	}

	public int sub(int a, int b) {

		int d = a - b;
		System.out.println("Subtraction is " + d);

		return d;

	}

	public static void main(String[] args) {

		DemoApp app1 = new DemoApp();
		app1.sayHello("raja");
		app1.add(20, 10);
		app1.sub(20, 10);
	}

}
