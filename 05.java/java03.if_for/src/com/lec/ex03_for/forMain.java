package com.lec.ex03_for;

public class forMain {

	public static void main(String[] args) {
		
		// i는 지역변수. for문블럭에서만 사용가능한 변수
		for(int i=0;i<=10;i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
//		System.out.println(i);	//Error. 지역변수
		
		
		// 1~100까지 합
		int num = 0;
		int i = 0;
		for(i=1;i<=100;i++) {
			num = num + i;
		}
		System.out.println("1~100까지의 합 = " + num);
		System.out.println("i = " + i);	//전역변수
	}

}
