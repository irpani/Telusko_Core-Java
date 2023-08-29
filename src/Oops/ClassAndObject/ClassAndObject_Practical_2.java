package Oops.ClassAndObject;

public class ClassAndObject_Practical_2 {
	public int add(int n1, int n2) {
		// int a;
		// System.out.println("in add");
		// return 0;

		// int r=num1+num2;
		// return r;

		int r = n1 + n2;
		return r;
	}
}

class Demo1 {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		ClassAndObject_Practical_2 calc = new ClassAndObject_Practical_2();
		int result = calc.add(4, 5);
		// calc.add();
		// int result=calc.add();
		// int result=num1+num2;
		System.out.println(result);

	}
}

// Object Oriented programming
// Object - Properties and Beahaviors

// Class