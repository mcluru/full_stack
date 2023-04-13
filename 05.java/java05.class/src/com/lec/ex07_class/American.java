package com.lec.ex07_class;

// 추상클래스를 상속받을 경우 추상메서드는 반드시 구현해야함
public class American extends Human {

	@Override
	void speak() {
		System.out.println("영어어로 말합니다");
	}

	@Override
	void move() {
		System.out.println("햄버거를 만듭니다");
	}

}
