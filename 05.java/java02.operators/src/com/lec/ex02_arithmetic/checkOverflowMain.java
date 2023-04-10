package com.lec.ex02_arithmetic;

public class checkOverflowMain {

	public static void main(String[] args) {
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Overflow가 발생되어 정상적인 연산을 수행할 수 없습니다");
		}
	}
	
	public static int safeAdd(int x, int y) {
		
		if(x>0) {
			if(x>(Integer.MAX_VALUE - y)) {
				//개발자가 강제로 예외발생시키기
				throw new ArithmeticException("Overflow가 발생했습니다");
			}
		} else {
			if(x<(Integer.MIN_VALUE - y)) {
				throw new ArithmeticException("Overflow가 발생했습니다");
			}
		}
		return x+y;
		
		
	}
	
	
	
}
