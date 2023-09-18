package Oops.Interface;

//From Java 8 Lamda Expression Comes into Picture
@Deprecated
class F {
	public void showTheDataWhichBelongsToThisClass() {
		System.out.println("in show A");
	}
}

// class G extends F { //getting Error is expected
// @Override
// // public void showTheDataWhichBelongToThisClass()
// public void showTheDataWhichBelongsToThisClass()
//
// {
// System.out.println("in show B");
// }
// }

public class LamdaExpressino_36 {
	public static void main(String[] args) {

		// G obj = new G();
		// obj.showTheDataWhichBelongsToThisClass();

	}
}
