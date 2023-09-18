package innerclasses;

class H {
	public void show() {
		System.out.println("in A show");
	}
}

// class B extends A
// {
// public void show()
// {
// System.out.println("in B Show");
// }
// }
// In Case Of Multi Threding we can use this Anonymous Inner class
public class AnonymousInnerClass_2 {
	public static void main(String[] args) {

		// A obj=new B();

		H obj = new H() {
			public void show() {
				System.out.println("in new show");
			}
		};
		obj.show();
	}
}
