package java8Examples;
//(2).Fuctional Interface which is havig only 1 Method

//*** vvimp point 
//Do u know Most Interfaces in Java Are Functional Interfaces so y don't u create object for one method

@FunctionalInterface
interface Aa {

	void show();

}
// Create a new Class is Not necessary for implement 1 method What we can do In
// this Case Anonymous Class Comes into Picture where object Creation itself
// Create implementation for the class

/*
 * class Bbc implements Aa {
 * 
 * @Override public void show() { System.out.println();
 * 
 * } }
 */
// Anonymous Inner Class
public class LamdaExpressionExample_2 {
	public static void main(String[] args) {
		Aa a = new Aa() {
			public void show() {
				System.out.println();
			}

		};

	}

}
