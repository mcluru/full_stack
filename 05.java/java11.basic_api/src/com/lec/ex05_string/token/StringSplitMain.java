package com.lec.ex05_string.token;

public class StringSplitMain {

	public static void main(String[] args) {
		
		// String.split()
		String str = "1,2,3,4,5,6,7,8,9,10";
		String[] nums = str.split(",");
		System.out.println(nums.length);
		for(String num:nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		String text = "홍길동,홍길자@홍길순&홍길상-홍길성";
		String[] names = text.split(",|&|-|@");
		for(String name:names) {
			System.out.print(name + " ");
		}
		System.out.println();
	}

}
