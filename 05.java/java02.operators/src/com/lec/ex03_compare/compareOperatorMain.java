package com.lec.ex03_compare;

public class compareOperatorMain {

	public static void main(String[] args) {
		
		//비교연산자 : <, >, <=, >=, !=
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = num1 == num2;
		boolean result2 = num1 != num2;
		boolean result3 = num1 <= num2;

		System.out.println("num1 == num2의 결과는 " + result1);
		System.out.println("num1 != num2의 결과는 " + result2);
		System.out.println("num1 <= num2의 결과는 " + result3);
		
		char char1 = 'A';	// 65
		char char2 = 'B';	// 66
		boolean result4 = char1 < char2;
		System.out.println("char1 <= char2의 결과는 " + result4);
		System.out.println();
		
		
		// 비교연산도 연산수행 전 형변환 발생 -> 피연산자의 타입을 일치시킴.
		System.out.println('A' == 65);	//true
		System.out.println(3 == 3.0);	//true
		System.out.println(0.1 == 0.1f);	// false
		// 이진포맷기수를 사용하는 모든 부동소수점타입은 0.1을 정확히 표현불가해서 true가 아닌 false가 결과값으로 산출됨.
		// 0.1f를 double로 형변환하면 실제값은 0.10000000149011612가 됨.
		System.out.println();
		
		System.out.println(0.1f);
		System.out.println((double)0.1f);
	}

}
