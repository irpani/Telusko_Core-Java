package java8Examples;
//(2).Fuctional Interface which is havig only 1 Method

//*** vvimp point *****
//Do u know Most Interfaces in Java Are Functional Interface  for 1 Method y don't we create one new class to implement this interface
@FunctionalInterface
interface S {
	void show();

}

class T implements S {

	@Override
	public void show() {
		System.out.println();

	}
}

public class LamdaExpressionBackgroud_1 {
	public static void main(String[] args) {
		S a = new T();
		a.show();
	}

}
