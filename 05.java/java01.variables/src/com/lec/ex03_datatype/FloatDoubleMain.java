package com.lec.ex03_datatype;

public class FloatDoubleMain {

	public static void main(String[] args) {
		
		// 실수의 기본 데이터타입 : double
		double d1 = 3.14;
		double d2 = 3.14D;
		double d3 = 3.13d;
		
//		float f1 = 3.14;	//3.14 데이터타입 : double
		float f1 = (float)3.14;	//강제형변환
		float f2 = 3.14f;		//명시적으로 선언
		float f3 = 3.14F;		//명시적으로 선언
		
		// 실수(float)는 정밀도의 문제가 있음.(컴퓨터는 이진법으로 원초적인 문제)
		float f4 = 0.1234567890123456789f;
		double d4 = 0.1234567890123456789;
		System.out.println("f4 = " + f4);
		System.out.println("d4 = " + d4);
		
		// 실수 0.1는 정확한 표현 불가. 정확한 값이 아닌 0.1에 근사값으로 리턴됨.
		System.out.println("1.0 - 0.9 = " + (1.0 - 0.9));
		System.out.println("1.0 - 0.9 = " + (1.0*10 - 0.9*10)/10);
	}

}
