package com.lec.ex02_variables;

public class VariableMain2 {

	public static void main(String[] args) {
		// 1. 변수의 선언 : 선언 & 초기화-----------------------------
		int val1 = 10;
		int val2 = 20;
		System.out.println("val1 = " + val1);
		System.out.println("val2 = " + val2);
		System.out.println("val1 + val2 = " + val1 + val2);
		System.out.println("(val1 + val2) = " + (val1 + val2));
		System.out.println();
		
		
		// 2. 변수의 동시선언-----------------------------------------
		int a, b, c;
//		System.out.println("a = " + a);	//초기화 에러
		
		int x=10, y=20, z=30;
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);

		int l, m, n = 40;	// l, m은 초기화 안됨
//		int l = m = n = 40;	// 문법에러
//		System.out.println("l = " + l + ", m = " + m + ", n = " + n);	
		System.out.println();
		
		
		// 3. 변수선언과 변수타입------------------------------------
		// 	a. 기본타입(promitive)
		//	 1) 정수 : byte(1), char(2), short(2), int(4), long(8)
		// 		정수 기본타입 : int
		
		// byte
		byte b1;	// -128 ~ 127 범위의 값만 가짐.
		byte b2;
		b1 = -128;
		b2 = 127;
		System.out.println("b1 = " + b1 + ", b2 = " + b2);
//		b1 = -129;	// -128을 벗어남
//		b2 = 128;	// byte타입이 표현할 수 있는 숫자범위를 초과함
		b1 = (byte)-12312;	// 정수의 기본타입은 int, int를 byte로 변환
		b2 = (byte) 12312;	// (byte) int타입인 12312을 byte로 강제변환
		System.out.println("b1 = " + b1 + ", b2 = " + b2);
		System.out.println();
		
		
		// char
		char c1 = 'A';	//한 개의 문자(내부적으론 유니코드값(정수)으로 저장됨. 작은따옴표(') 사용
		char c2 = '가';
		// A는 내부적으로 65, 가는 44032의 정수(유니코드)값으로 저장됨.
//		char c3 = "A";	// 큰따옴표(")는 문자열이기 때문에 에러
//		char c4 = 'AA'; // 한 개 이상의 문자 저장불가
		char c5 = 65;		// A
		char c6 = 44032;	// 가
		char c7 = 97;		// a
		char c8 = 48;		// 0
		System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c5 = " + c5 + ", c6 = " + c6 + ", c7 = " + c7 + ", c8 = " + c8);
		System.out.println();
		
		
		// short
		short s1;	// -2의 15승 ~ 2의 15승-1 의 범위
		short s2;
		s1 = -32768;
		s2 = 32767;
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		System.out.println();
		
		
		// int
		int i1 = 'A';	//int i1 = 65; 와 동일
		int i2 = 'Z';	//int i2 = 90;
		int i3 = '0';
		int i4 = -2147483648;
		int i5 = 2147483647;
		System.out.println("i1 = " + i1 + ", i2 = " + i2 + " i3 = " + i3);
		System.out.println();
		
		
		// long
		long l1;	// -2의 61승 ~ 2의 61승-1
		long l2;
//		l1 = -2147483649;	// 숫자리터럴의 기본타입은 int타입
//		l2 = 2147483648;	// int표현범위를 초과한 에러
		l1 = -2147483649L;	// L or l로 선언
		l2 = 2147483647L;	// int -> long변환 -> l2에 대입
		System.out.println("l1 = " + l1 + ", l2 = " + l2);
		System.out.println();
		
		
		
		
		//	 2) 실수 : float(4), double(8)
		// 		실수 기본타입 : double (float타입은 값 뒤에 F or f로 선언하거나 데이터타입을 변경(형변환)해야함.
		
		// float
		float f1 = 1.0F;
		float f2 = 3.14f;
		System.out.println("f1 = " + f1 + ", f2 = " + f2);
		System.out.println();
		
		
		// double
		double d1 = 1.0D;
		double d2 = 3.14d;
		double d3 = 1.0;
		double d4 = 3.14;
		System.out.println("d1 = " + d1 + ", d2 = " + d2 + ", d3 = " + d3 + ", d4 = " + d4);
		System.out.println();

		
		
		
		//	 3) 논리 : boolean(1)
		//			   true, false. 내부적으로 true = 1, false = 0의 정수값.
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("bool1 = " + bool1 + ", bool2 = " + bool2);

		
				
		
		// 	b. 참조타입(reference)

	}

}
