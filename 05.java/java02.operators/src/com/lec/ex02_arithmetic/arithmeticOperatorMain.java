package com.lec.ex02_arithmetic;

/*
 	산술연산자(+,-,*,/,%)
 	 사칙연산과 나머지를 구하는 연산자(%)를 포함해 총 5개.
 	 boolean타입을 제외한 모든 기본 타입에 사용 가능.
 	 
 	 산술연산자의 특징 : 피연산자들의 타입이 동일하지 않을 경우 피연산자들의 타입을 일치시킨 수 연산 수행.
 	 					 타입을 일치시킬 경우엔 아래와 같은 규칙을 가지고 수행함.
 	 	 1. 피연산자들의 모두 정수타입이고 int타입보다 크기가 작을 경우 모두 int로 형변환 후 연산수행. -> 연산결과 : int
 	 	 	ex) byte+byte -> int+int -> 결과 int
 	 	 2. 피연산자들이 모두 정수타입이고 long타입이 있을 경우 모두 long으로 형변환 후 연산수행. -> 연산결과 : long
 	 	 	ex) int+long -> long+long -> 결과 long
 	 	 3. 피연산자중 실수타입(float, double)이 있을 경우, 크기가 큰 실수타입으로 변환 후 연산수행 -> 연산결과 : 실수
 	 	 	ex) int+double -> double+double -> 결과 double
 	 	
 	 	
 	 	 정리하면, long을 제외한 정수타입의 연산은 int타입으로 연산되고
 	 	 피연산자중 실수타입이 하나라도 있으면 실수타입으로 계산됨.
 	 	 
 	 	 
 	 	 
	  ※ 정수타입 연산결과가 int타입으로 나오는 이유 : JVM이 기본적으로 32bite(4byte)단위 연산을 수행하기 때문
*/

public class arithmeticOperatorMain {

	public static void main(String[] args) {
		
		byte byte1 = 1;
		byte byte2 = 1;
//		byte byte3 = byte1+byte2;	//형변환을 하지 않을경우 에러
		int result1 = byte1+byte2;
		System.out.println("result1 = "+result1);
		
		
		int int1 = 10;
		int int2 = 4;
		int result2 = int1+int2;	//정수타입의 연산은 기본으로 int타입으로 수행됨
		System.out.println("result2 = " + result2);
		
		
		double result3 = int1/int2;
		System.out.println("result3 = " + result3);
		
		
		result3 = (int1/4.0);
		System.out.println("result3 = "+result3);
		System.out.println("------------------------------");
		
		
		int v1 = 5;
		int v2 = 5;
		result1 = v1+v2;
		System.out.println("v1 + v2 = " + result1);
		
		result1 = v1-v2;
		System.out.println("v1 - v2 = " + result1);
		
		result1 = v1*v2;
		System.out.println("v1 * v2 = " + result1);
		
		result1 = v1/v2;
		System.out.println("v1 / v2 = " + result1);
		
		result1 = v1%v2;
		System.out.println("v1 % v2 = " + result1);
		
	}

}
