package com.lec.ex04_while;

import java.io.IOException;
import java.util.Scanner;
//import java.lang.System;	//기본이기 때문에 안해도 됨

public class doWhileMain {

	public static void main(String[] args) throws IOException {
		
		// 키보드로부터 문자열 입력받는 방법
		// System.in.read()은 한개의 문자(key코드)만 읽을 수 있기 때문에 콘솔에 입력된 문자열을 한꺼번에 읽을 수 없음
		
		System.out.print("문자를 입력하세요 ==>");	// 글자가 기울어지면 무조건 static메소드
		System.out.println(System.in.read());
		
		// 콘솔창에 입력된 문자열을 한 번에 읽기 위해 Scanner객체 생성하고 nextLine()메서드를 호출
		//	 --> 콘솔에 입력된 문자열을 한꺼번에 읽을 수 있음
		System.out.println("이름을 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		// import 1) ctrl+space 누르고 import할 라이브러리 선택
		//		  2) ctrl+shift+o 자동임포트
		Scanner sc = new Scanner(System.in);
		String name = null;
		
		do {
			System.out.println("이름을 입력하세요");
			name = sc.nextLine();
			System.out.println("당신의 이름은 " + name);
		} while(!name.contentEquals("q"));
		
		System.out.println();
		System.out.println("프로그램이 종료되었습니다");
		
		
		
	}

}
