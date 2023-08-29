package Oops.Interface;

@FunctionalInterface
interface O {
	void show();
	// void run();
}
// class B implements A
// {
// public void show()
// {
// System.out.println("in Show");
// }
// }

public class FunctioalInterface_35 {
	public static void main(String[] args) {

		O obj = new O() {
			public void show() {
				System.out.println("in Show");
			}
		};
		// A obj=new A();
		// A obj=new B();
		obj.show();
	}
}
