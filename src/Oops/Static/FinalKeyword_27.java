package Oops.Static;
//final - variable, method, class

//final class Calc
//{
//	public void show()
//	{
//		System.out.println("in Calc show");
//	}
//	public void add(int a, int b)
//	{
//		System.out.println(a+b);
//	}
//}

class Calc2 {
	public final void show() {
		System.out.println("By Navin");
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}
}

// class AdvCalc4 extends Calc2 {
// public void show() { //Cann't Override throws Error
// System.out.println("By John");
//
// }

public class FinalKeyword_27 {
	public static void main(String[] args) {

		// final int num=8;
		// num=9;
		// System.out.println(num);

		// Calc obj= new Calc();
		// obj.show();
		// obj.add(4, 5);

		// AdvCalc obj= new AdvCalc();
		// obj.show();
		// obj.add(4, 5);
	}
}