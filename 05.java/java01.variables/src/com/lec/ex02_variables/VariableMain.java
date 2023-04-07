package com.lec.ex02_variables;

/*
 	1. 변수란?
 		프로그램은 작업을 처리하는 과정에서 필요에 따라 데이터를 메모리에 저장함.
 		이 때 변수를 사용하는데 변수(variable)는 값을 저장하는 하나의 메모리 공간.
 		프로그램에서 수시로 값이 변동될 수 있기 때문에 변수라 지칭.
 		따라서 변수란 변동되는 값을 가진 하나의 메모리 공간. 하나/복수개의 값을 저장할 수 있는 메모리공간
 	
 	
 	2. 변수의 명명규칙
 		1) 첫 번째 글자 : 문자, $, _(언더바)로 시작하며 숫자로 시작불가 (필수)
 						  소문자로 시작하고, 단어 구분마다 대문자로 선언 (관례)
 						  	- camel case(firstName), snake case(first_name)
 		2) 변수명은 대소문자 구분함 (필수)
 		3) 변수명 길이 : 제한 x
 		4) 한글변수명도 가능하지만 사용안함 (관례)
 		5) 자바예약어 (if, for ...)는 사용불가
 		
 		
 	3. 변수의 사용
		변수에 값을 저장하고 읽는 행위. 변수에 값 저장할 땐 대입연산자(=) 사용함.
		우변의 변수/값을 좌변의 변수에 대입(저장)의 의미(일반 수학에서 사용하는 =와 의미가 다름)
		
		변수를 선언하고 처음 값을 저장하는걸 초기화, 그 값을 초기값이라 함.
		따라서, 자바에서는 변수에 초기값을 준다는 의미 == 변수의 초기화
		
		리터럴(literal), 상수(constant, 변하지 않는 값)는 원래는 같은 의미지만,
		Java에서 literal은 값을 변경할 수 없고, 상수는 한 번 값을 저장하면 변경할 수 없는 변수로 정의함. -> literal과 constant는 구분해서 사용.
		
 */

public class VariableMain {

	public static void main(String[] args) {
		
		// 1. 변수의 선언방법
		// 	a. 변수타입(데이터타입) 변수명;
		//  b. 변수타입(데이터타입) 변수명 = 초기값;
		int firstNumber = 10;
//		int firstNumber = 20; //에러 : 한번 선언된 변수 재선언 불가
//		firstNumber = 10.0; //에러 : 선언된 데이터타입과 다른 데이터타입은 원칙적으로 불가
		int firstnumber = 20; //대소문자 구분
		int FirstNumber = 30;
		int 한글명변수 = 40;
		
		System.out.println("firstNumber = " + firstNumber);
		System.out.println("firstnumber = " + firstnumber);
		System.out.println("FirstNumber = " + FirstNumber);
		System.out.println("한글명변수 = " + 한글명변수);
		System.out.println();
		
		
		
		// 2. 변수의 선언
		int val1;	// 선언만 하고 초기화 안함
//		System.out.println(val1); //초기화되지 않은 변수는 사용불가
		
		val1 = 20;
		System.out.println("val1 = " + val1);
		
		int val2 = 20;	// 선언과 동시에 초기화
		System.out.println("val2 = " + val2);
		
		int val3;
//		int val4 = val3 + 50;
	
		
	}

}
