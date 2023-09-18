package Streams;

import java.util.Arrays;
import java.util.List;

//Stream Api Comes into Picture in 1.8 ,It's generally used for Collection Of Objects
//Before 1.8 we calculate And store it in Dummy DataStructure then we will do Another operatio nto Store
//When Streams Comes into Picture Each And Every thing we will do in a Single Line not Storing the Intermediate Results into certai
//List Of Objects So Code is Concise and readable Code 

public class StreamApi {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

		// Stream<Integer> s1=nums.stream();
		// Stream<Integer> s2= s1.filter(n ->n%2==0);
		// Stream<Integer> s3= s2.map(n->n*2);
		// int result=s3.reduce(0,(c,e)->c+e);
		//
		// s2.forEach(n -> System.out.println(n));
		// s3.forEach(n -> System.out.println(n));
		//
		// s1.forEach(n-> System.out.println(n));
		// s1.forEach(n-> System.out.println(n));

		int result = nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);
		System.out.println(result);

	}
}
