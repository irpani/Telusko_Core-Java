package Oops.ClassAndObject;

class M {
	public M() {
		System.out.println("object created");
	}

	public void show() {
		System.out.println("in A show");
	}
}

public class AnonymousObject_17 {
	public static void main(String a[]) {
		int marks;
		marks = 99;

		new M(); // anonymous object
		new M().show();

		// A obj=new A();
		M obj;
		obj = new M();

		obj.show();
	}
}
