package com.lec.ex06_op;

public class opPromotionMain {

	public static void main(String[] args) {
		
		// 연산시에 현병환 발생
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) 30;
		
		//java에서 정수형 연산의 기본은 int.
		byte b4 = (byte)(b1+b2);	//b1, b2가 int로 자동형변환 후 더한 결과를 byte로 강제형변환해서 b4에 대입
		int i1 = b1+b2;		// b1, b2를 int로 자동형변환 후 더하기 연산결과를 i1에 대입
		
		char c1 = '가';		// A=65, a=98
		char c2 = '1';
//		char c3 = c1+c2;	//Error
		char c3 = (char)(c1+c2);
		System.out.println("c3 = "+c3);
		
		int i2 = (char)(c1+c2);
		System.out.println("i2 = "+i2);
		System.out.println("c2 = "+c2);
		
		
		
		
	}

}
