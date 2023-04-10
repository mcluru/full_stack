package com.lec.ex02_arithmetic;

public class accuracyMain {

	public static void main(String[] args) {
		
		// 정확한 연산을 해야하는경우 실수타입 사용 지양
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - (number*pieceUnit);
		System.out.println("남은 사과조각 = " + result);
		// 상기결과는 정확하게 0.3이 나와야하지만, 0.29999999999999993이 나옴
		// 실수의 계산은 이진포맷의 기수(이진법)을 사용하기 때문에 0.1을 정확하게 표현할 수 없어 근사치로 처리하기 때문
		// 따라서 정확한 계산이 필요한 경우 정수연산으로 변경해 처리한다
		
		int totalPieces = apple * 10;
		int temp = totalPieces - 7;
		System.out.println(temp);
		result = temp/10.0;
		
		System.out.println("사과 한개에서 0.7조각을 빼면");
		System.out.println(result + "조각이 남습니다");

		
		
	}

}
