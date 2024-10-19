package Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		//Array_list Practice
		// New Changes Added in in this Programme
		// Collection Methods 19 I Cann't add Based On Index ,for Index we have some
		// other Methods
		// Collection<Integer> nums= new ArrayList<Integer>();
		// Collection nums=new ArrayList();
		// Crate the Object for Arraylist
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		nums.add(10);
		nums.add(20);
		nums.add(80);
		nums.add(100);
		// nums.add("5");
		// My Requirement here I need to Add Element between 5 and 8 Based on Index
		// In this Case List Interface Coming in to Picture
		System.out.println(nums.get(2));

		System.out.println(nums.indexOf(2));
		// Enhanced FoR lOOP
		// for(int n:nums)
		// {
		// System.out.println(nums);
		// }
		for (Object n : nums) {
			int num = (Integer) n;
			System.out.println(nums);
		}
	}
}
