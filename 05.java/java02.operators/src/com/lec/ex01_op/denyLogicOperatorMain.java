package com.lec.ex01_op;

public class denyLogicOperatorMain {

	public static void main(String[] args) {
		
		// 논리부정연산자(!)
		// 	true, false를 부정하는 연산자.(boolean타입에만 사용가능)
		//	피연산자가 true면 false, false면 true 리턴
		//	조건문과 제어문에서 사용되며, 조건식의 값을 부정하도록 하여 실행흐름 제어할 때 주로 사용
		
		
		boolean isPlay = true;
		System.out.println("isPlay = " + isPlay);

		
		isPlay = !isPlay;
		System.out.println("isPlay = " + isPlay); 
		
		isPlay = !isPlay;
		System.out.println("isPlay = " + isPlay); 
		
		
	}

}
