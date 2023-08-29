package Oops.ClassAndObject;

//class Computer
//{
//	
//}
//class Laptop extends Computer
//{
//	
//}

class Z {
	public void show() {
		System.out.println("in A show");
	}
}

class Y extends Z {
	public void show() {
		System.out.println("in B show");
	}
}

class X extends Z {
	public void show() {
		System.out.println("in C show");
	}
}

class D {

}

public class DynamicMethodDispatch_26 {
	public static void main(String[] args) {
		// A obj=new B();
		// obj.show();

		Z obj = new Z();
		obj.show();

		obj = new Y();
		obj.show();

		obj = new X();
		obj.show();

		// obj=new D();

		// Laptop obj1=new Laptop();
		// Computer obj1=new Laptop();

	}
}