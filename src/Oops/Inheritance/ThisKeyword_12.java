package Oops.Inheritance;

class Human2 {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void SetAge(int age, Human2 obj) {
		// Human obj1=new Human();
		Human2 obj1 = obj;
		obj1.age = age;
		// this.age=age;
	}

	// public void SetAge(int a)
	// {
	// age=a;
	// }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public void setName(String n)
	// {
	// name=n;
	// }

}

public class ThisKeyword_12 {
	public static void main(String[] args) throws ClassNotFoundException {
		Human2 obj = new Human2();

		obj.SetAge(30, obj);
		// obj.SetAge(30);
		obj.setName("Reddy");

		// System.out.println(obj.abc()+" : "+obj.getAge());
		System.out.println(obj.getName() + " : " + obj.getAge());

	}
}
