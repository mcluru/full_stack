package com.lec.ex08_class;

public class humanMain {

	public static void main(String[] args) {
		
		// interface(인터페이스) - 인스턴스화 불가
		// 하지만, 익명구현객체로 선언 가능함
//		Human human = new Human();
		
		Korean kor = new Korean();
		// 인터페이스에서 필드는 무조건 상수.
//		kor.NATION = "대한민국";
		kor.speak("한국어");
		kor.move();
		kor.think();
		System.out.println();
		
		
		American usa = new American();
		usa.speak("영어");
		usa.move();
		usa.think();
	}

}
