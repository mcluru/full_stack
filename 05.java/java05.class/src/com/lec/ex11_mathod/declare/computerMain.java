package com.lec.ex11_mathod.declare;

public class computerMain {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		System.out.println("1~10까지 합 : " + com.add(1,2,3,4,5,6,7,8,9,10));
		System.out.println("1~5까지 합 : " + com.add(1,2,3,4,5));
		System.out.println();
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("1~10까지 합 : " + com.add(arr));
		System.out.println("1~5까지 합 : " + com.add(new int[] {1,2,3,4,5}));
		System.out.println();
		
		
		System.out.println("1~10까지 합 : " + com.add1(1,2,3,4,5,6,7,8,9,10));
		System.out.println("1~5까지 합 : " + com.add1(1,2,3,4,5));
		System.out.println("1~3까지 합 : " + com.add1(1,2,3));
		System.out.println("1~11까지 합 : " + com.add1(1,2,3,4,5,6,7,8,9,10,11));
		
		
		
	}

}
