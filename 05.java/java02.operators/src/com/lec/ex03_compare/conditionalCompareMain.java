package com.lec.ex03_compare;

public class conditionalCompareMain {

	public static void main(String[] args) {
		// 삼항연산자 (조건식 ? true일경우 : false일경우)는 세개의 피연산자를 필요로함.
		// ? 앞의 조건식에 따라 콜론(:) 앞뒤의 피연산자가 선택됨 -> 조건연산식이라 부르기도 함
		
		// 사용방법
		// 조건식 ? 값or표현식 : 값or표현식
		
		int score = 85;
		if(score>=90) {
			System.out.println("A학점입니다");
		} else {
			System.out.println("B학점입니다");
		}
		
		// 삼항연산식
//		(score >= 90) ? System.out.println("A학점입니다"); : System.out.println("B학점입니다");		//Error
		char grade = (score>=90) ? 'A' : 'B';
		System.out.println(grade + "학점입다");
		
		
		
	}

}
