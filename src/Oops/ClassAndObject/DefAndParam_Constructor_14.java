package Oops.ClassAndObject;

class Human4 {
	private int age;
	private String name;

	public Human4() {
		age = 12;
		name = "John";
	}

	public Human4(String name) {
		this.age = age;
		this.name = name;
	}

	public Human4(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// public Human() //default constructor
	// {
	// age=12;
	// name="John";
	// //System.out.println("in constructor");
	// }
	// public Human(int a, String n) //Parameterized constructor
	// {
	// age=a;
	// name=n;
	// }

	public int getAge() {
		return age;
	}

	public void SetAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class DefAndParam_Constructor_14 {
	public static void main(String[] args) throws ClassNotFoundException {
		Human4 obj = new Human4();
		// Human obj1=new Human(18, "Navin");
		System.out.println(obj.getName() + " : " + obj.getAge());
		// System.out.println(obj1.getName()+" : "+obj1.getAge());

		// obj.SetAge(30);
		// obj.setName("Reddy");

		// System.out.println(obj.getName()+" : "+obj.getAge());
	}
}
