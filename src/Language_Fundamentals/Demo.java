package Language_Fundamentals;

@Deprecated
class A {
	public void showTheDataWhichBelongsToThisClass() {
		System.out.println("in show A");
	}
}

class B extends A {
	@Override
	// public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass()

	{
		System.out.println("in show B");
	}
}

// This Class will helps us to call the Above Classes
public class Demo {
	public static void main(String[] args) {

		B obj = new B();
		obj.showTheDataWhichBelongsToThisClass();

	}
}
