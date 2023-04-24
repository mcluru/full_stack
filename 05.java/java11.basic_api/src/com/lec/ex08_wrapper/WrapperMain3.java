package com.lec.ex08_wrapper;

public class WrapperMain3 {

	public static void main(String[] args) {
		
		// 1. 박싱
		int val1 = Integer.valueOf("100");
		
		// 2. 파싱
		int val2 = Integer.parseInt("100");
		double val3 = Double.parseDouble("100.0");
		double val4 = Double.parseDouble("100.0d");
		float val5 = Float.parseFloat("100f");
		boolean val6 = Boolean.parseBoolean("true");
		boolean val7 = Boolean.parseBoolean("0");	//true가 아닌 모든값은 false
		
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println(val7);
		
		
	}

}
