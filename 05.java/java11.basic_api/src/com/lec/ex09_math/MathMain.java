package com.lec.ex09_math;

/*
	Math 클래스
	
	java.lang.Math클래스는 수학연산에 사용할 수 있는 정적메서드를 제공한다
	Math클래스의 메서드는 모두 정적메서드이므로 객체생성없이 Math클래스로 바로 사용가능하다
*/

public class MathMain {

	public static void main(String[] args) {
		
		// 1. abs
		int v1 = Math.abs(-1);
		double v2 = Math.abs(-3.14);
		System.out.println(v1+", "+v2);
		
		
		// 2. ceil
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v3+", "+v4);
		
		
		// 3. floor
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println(v5+", "+v6);
		
		
		// 4. max, min
		v3 = Math.max(v5, v6);
		v4 = Math.min(v5, v6);
		System.out.println(v3+", "+v4);
		
		
		// 5. rint : 가장 가까운 정수
		v3 = Math.rint(5.3);
		v4 = Math.rint(-5.6);
		System.out.println(v3+", "+v4);
		
		
		// 6. random
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*45)+1);
		
		
		// 7. round
		v3 = Math.round(5.3);
		v4 = Math.round(5.6);
		System.out.println(v3+", "+v4);
		
	}

}
