package Oops.Interface;

interface G {
	// public abstract void show();
	// public abstract void config();
	int age = 44; // final and static
	String area = "Mumbai";

	void show();

	void config();
}

class I implements G {
	public void show() {
		System.out.println("in show");
	}

	public void config() {
		System.out.println("in cofing");
	}
}

public class InterfaceBasics_31 {
	public static void main(String[] args) {

		G obj;
		obj = new I();

		obj.show();
		obj.config();

		// A.area="Hyderabad";

		System.out.println(G.area);

	}
}
