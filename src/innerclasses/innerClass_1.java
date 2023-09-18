package innerclasses;

//	Ex: Employeee  and their inner class is Salary
class A {
	int age;

	public void show() {
		System.out.println("in show");
	}

	// class B
	// {
	// public void config()
	// {
	// System.out.println("in config");
	// }
	// }

	static class B {
		public void config() {
			System.out.println("in config");
		}
	}
}

public class innerClass_1 {
	public static void main(String[] args) {
		A obj = new A();
		obj.show();

		// A.B obj1=obj.new B();
		// obj1.config();

		A.B obj1 = new A.B();
		obj1.config();

	}
}
