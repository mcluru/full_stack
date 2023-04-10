package com.lec.ex03_datatype;

public class StringMain {

	public static void main(String[] args) {
		// 1. 기본타입 - 정수(byte, short, char, int, long), 실수(float, double), 논리(boolean)
		// 2. 참조타입 - Class, Array, Interface, Enum
		// String(문자열)은 참조(Reference)타입, 문자열은 String이라는 클래스타입.
		// 자바에선 클래스로 선언된건 모두 참조타입.
		// 자바에서 문자열을 표현할 땐 큰 따옴표로 선언함.(작은 따옴표는 char타입 선언 시 사용)
		
		char c1 = 'A';	//기본타입인 정수 중 하나인 char타입
//		char c2 = "A";	//Error : char타입은 한개의 문자(내부적으로 유니코드 정수값)만 지정가능.
		String str1 = "A";
		String str2 = "AAA";
		
		// 참조타입은 객체가 저장되어 있는 주소
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("문자열 A가 저장된 메모리주소 = " + str1.hashCode());
		System.out.println("문자열 AAA가 저장된 메모리주소 = " + str2.hashCode());
		System.out.println("str1이 저장한 값 = " + str1.toString());
		System.out.println("str2이 저장한 값 = " + str2.toString());
		System.out.println();
		
		
		// literal과 constant의 비교
		// 상수 : final로 선언된 변수. constant값이 한번 설정되면 변경불가
		// 상수 변수명 : 모두 대문자로 선언, 단어마다 언더바(_) 즉 스네이크 방식(관례)
		final int min_value = 0;	//관례에 위배된 변수명 선언
		final int MIN_VALUE = 0;	//관례에 따른 변수명 선언
//		min_value = 10;		//Error : 상수(final로 선언된 변수)는 변경불가
		
		final int MAX_VALUE;	//선언만 되고 초기화 안된 경우
		MAX_VALUE = 100;		//초기화
//		MAX_VALUE = 1000;		//Error
		
		//예시
		final double pi = 3.141592;

	}

}
