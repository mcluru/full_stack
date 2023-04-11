package com.lec.exercise.answer;

public class exercise04 {

	public static void main(String[] args) {
//		 4. Exercise04.java : 
//		    while문과 Math.random()메서드를 이용해서 두개의 주사위를 던졌을 때 나오는 눈을 
//		    (눈1, 눈2)형태로 출력하고 눈의 합이 5가아니면 계속 주사위를 던지고 눈의 합이 5이면
//		    실행을 멈추는 코드를 작성 (눈의 합이 5가되는 조합은 (1,4) (4,1) (2,3) (3,2)
		
		int num1, num2;
		
		while(true) {
			num1 = (int)(Math.random()*6+1);
			num2 = (int)(Math.random()*6+1);
			System.out.println("("+num1+", "+num2+")");
			if(num1+num2 == 5) {
				System.out.println("눈의 합이 5입니다");
				System.out.println("프로그램을 중단합니다");
				break;
			}
		}
		
		
		
		
	}

}
