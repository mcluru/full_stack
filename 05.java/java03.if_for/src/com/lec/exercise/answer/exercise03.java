package com.lec.exercise.answer;

public class exercise03 {

	public static void main(String[] args) {
//		 3. Exercise03.java : 
//		    for문을 이용해서 1~100까지의 정수중 3의 배수총합을 구하는 코드
		
		int sum = 0;
		for(int i=0 ; i<=100 ; i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		System.out.println("1~100까지의 정수중 3의 배수 총합 : " + sum);
		
		
		
	}

}
