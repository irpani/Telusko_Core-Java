package java8Examples;

@FunctionalInterface
interface Aba {

	void show();

}
//Write Class LamdaExample
public class LamdaExampleCode_3 {
	public static void main(String[] args) {
		Aba obj = () -> System.out.println("Interface method Implemented with Lamda Expression");

		obj.show(); // This step must for accessing the method we call it with Object Reference

	}

}
