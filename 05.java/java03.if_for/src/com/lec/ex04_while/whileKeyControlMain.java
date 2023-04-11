package com.lec.ex04_while;

import java.io.IOException;

public class whileKeyControlMain {

	public static void main(String[] args) throws IOException {
		
		// 외부에서 특정의 값을 입력받기 위한 여러 방법 중
		// System.in의 read()메서드는 키보드의 입력을 대기 -> 엔터키를 친 후 입력값의 ASCII코드값 정수를 리턴함
		// ReturnKey = 13, EnterKey = 10, A=65, a=97, 0=48
		
//		System.out.println("키보드에서 문자를 입력하세요");
//		int key = System.in.read();
//		System.out.println("입력된 키의 값(ASCII)은 " + key);
		
		
		// 리모콘 제어 프로그램 만들기
		// 1번키 : 볼륨업, 2번키 : 볼륨다운, 3번키 : 음소거&중단
		
		boolean run = true;
		int keyCode = 0;
		int volumn = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("---------------------------------");
				System.out.println("1.볼륨업 2.볼륨다운 3.음소거&종료");
				System.out.println("---------------------------------");
			}
			keyCode = System.in.read();
			System.in.skip(2);
//			System.out.println("입력된 키코드 값 : " + keyCode);
			
			if(keyCode==49) {
				volumn++;
				System.out.println("현재볼륨은 " + volumn);
			} else if(keyCode==50) {
				volumn--;
				System.out.println("현재볼륨은 " + volumn);
			} else if(keyCode==51) {
				run = false;
			}

		}
		System.out.println("프로그램이 종료되었습니다");
		
		
		
		
		
	}

}
