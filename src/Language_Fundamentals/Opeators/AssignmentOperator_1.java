package Language_Fundamentals.Opeators;

//(1)Arithmatic Operators                   +  -  *  /  %

//(1)(a).Assignment Operators               =  +=  -=  *=  /=  %=
//(1)(b).Unary Operator' Incremeent & Decrement Operators   ++   --

public class AssignmentOperator_1 {

	public static void main(String[] args) {
		/**
		 * int num1=7; int num2=5; int result=num1+num2; System.out.println(result);
		 **/

		/**
		 * int num1=7; int num2=5; int result=num1-num2; System.out.println(result);
		 **/

		/**
		 * int num1=7; int num2=5; int result=num1*num2; System.out.println(result);
		 **/

		/**
		 * int num1=7; int num2=5; int result=num1/num2; System.out.println(result);
		 **/

		/**
		 * int num1=7; int num2=5; int result=num1%num2; System.out.println(result);
		 **/

		int num = 7;
		// num=num+2;
		// num+=2;
		// num*=2;

		num++; // post increment
		++num; // pre increment
		num--; // post decrement
		--num; // pre decrement
		System.out.println(num);

		int result = num++; // fetch the value and then increment
		System.out.println(result);

	}

}
