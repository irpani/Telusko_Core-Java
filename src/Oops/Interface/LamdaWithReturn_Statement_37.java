package Oops.Interface;

@FunctionalInterface
interface M {
	int add(int i, int j);
}

public class LamdaWithReturn_Statement_37 {
	public static void main(String[] args) {
		//
		// A obj=new A()
		// {
		// public int add(int i, int j)
		// {
		// return i+j;
		// }
		// };

		M obj = (i, j) -> i + j;

		int result = obj.add(5, 4);
		System.out.println(result);
	}
}
