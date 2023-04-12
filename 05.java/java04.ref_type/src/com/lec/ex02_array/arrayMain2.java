package com.lec.ex02_array;

public class arrayMain2 {

	public static void main(String[] args) {
		// 2. new 연산자 - 배열선언 및 초기화
		int scores[];	//배열선언만 됨. 크기/값 등의 선언은 안됨
//		System.out.println(scores[0]);	//Error :  not have been initialized
		scores = new int[] {90, 95, 88, 90, 89, 100, 99, 78, 66, 65, 88, 99};
		
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("배열요소의 합계 = " + sum);
		System.out.println("배열요소의 평균 = " + (sum/scores.length) + "\n");
		
		
		// 3. 메서드를 이용한 배열처리
		int tot = total(scores);
		System.out.println("배열요소의 합계 = " + tot);
		System.out.println("배열요소의 평균 = " + (tot/scores.length) + "\n");
		
		
		xxx();
	}
	
	static void xxx() {};	

	public static int total(int[] scores) {
		int tot = 0;
		for(int score : scores) {
			tot += score;
		}
		return tot;
	}

}
