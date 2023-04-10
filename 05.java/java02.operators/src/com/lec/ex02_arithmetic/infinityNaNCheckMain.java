package com.lec.ex02_arithmetic;

public class infinityNaNCheckMain {

	public static void main(String[] args) {
		
		// /,%연산 수행 시 주의점
		// 	좌측 피연산자가 정수타입인 경우 우측 피연산자는 0 사용불가
		// 	0으로 나누는 경우 ArithmeticException예외 발생.
		// 	그러나 실수타입인 경우 0.0 or 0.0f로 나누면 예외발생 없이 나누기연산은 무한대(Infinity)의 결과값, 나머지연산은 NaN(Not a Number)의 결과를 리턴함.
		
//		System.out.println(5/0);	// ArithmeticException예외 발생
		System.out.println(5/0.0);	// Infinity값을 리턴
		System.out.println(5%0.0);	// NaN값을 리턴
		
		// Java에선 /,%연산의 결과가 Infinity or NaN인지 확인하려면
		// Double.isInfinite(), Double.inNan()메서드 이용함.
		// 두 메서드는 리턴값이 Infinity or NaN이면 true를 리턴, 아니면 false 리턴
		
		
		int x = 5;
		double y = 0.0;
		
		double z1 = x / y;
		double z2 = x % y;
		
		System.out.println(Double.isFinite(z1));
		System.out.println(Double.isInfinite(z1));
		System.out.println(Double.isFinite(z2));
		System.out.println(Double.isInfinite(z2));
		System.out.println();
		
		
		System.out.println(Double.isNaN(z1));
		System.out.println(Double.isNaN(z2));
		System.out.println();
		
		System.out.println("z1 + 2 = " + (z1+2));
		System.out.println("z2 + 2 = " + (z2+2));
		System.out.println();
		
		if(Double.isInfinite(z1) || Double.isNaN(z2)) {
			System.out.println("계산할 수 없습니다");
		} else {
			System.out.println("z1 + 2 = " + (z1+2));
			System.out.println("z2 + 2 = " + (z2+2));
		}
		
	}

}
