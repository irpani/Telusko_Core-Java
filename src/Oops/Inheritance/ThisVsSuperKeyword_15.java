package Oops.Inheritance;

class Abc extends Object {
	int num = 1;
}

class Bb extends Abc {
	int num = 2;

	public int getValue() {
		int num = 3;
		// return this.num;
		return super.num;
	}
}

public class ThisVsSuperKeyword_15 {
	public static void main(String a[]) {
		Bb obj = new Bb();
		// System.out.println(obj.num);
		System.out.println(obj.getValue());
	}
}