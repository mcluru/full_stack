package com.lec.ex02_arithmetic;

public class overflowMain {

	public static void main(String[] args) {
		
		// 산술연산할 때 주의할 점
		// 	연산후의 값이 데이터타입으로 충분히 표현가능한지 확인해야함.
		//	표현할 수 없는 값이 산출될 경우 overflow 발생 -> 결과값은 쓰레기값을 얻을 수 있음
		
		int x = 1000000;
		int y = 1000000;
		int z = x+y;
		System.out.println("x + y = " + z);
		
		z = x*y;
		System.out.println("x * y = " + z);
		
		// 위와 같은 에러방지를 위해 두 변수 중 하나는 long으로 선언되어 z의 데이터타입고 long이 되어야함
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = x1*y1;
		System.out.println("x1 * y1 = " + z1);
		
		
		
	}

}
