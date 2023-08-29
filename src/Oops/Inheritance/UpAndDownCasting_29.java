package Oops.Inheritance;

class P {
	public void show1() {
		System.out.println("in A show");
	}
}

class Q extends P {
	public void show2() {
		System.out.println("in show B");
	}
}

public class UpAndDownCasting_29 {
	public static void main(String[] args) {

		// double d=4.5;
		// int i=(int)d;
		//
		// System.out.println(i);

		// A obj= new A();
		// A obj=(A) new B(); //upcasting
		// obj.show1();

		P obj = new Q();
		obj.show1();

		Q obj1 = (Q) obj;
		obj1.show2();
	}
}
