package com.lec.ex01_inheritance;

public class American extends Eve {
	
	@Override
	public String toString() {
//		return super.toString()
		return "나는 미국사람입니다. 내이름은 " + this.name + "입니다";
	}
	
	
	@Override
	void speak() {
//		super.speak();	//super는 eve.speak()
		System.out.println("영어로 말합니다");
	}
	
	
	@Override
	void move() {
		System.out.println("다이어트를 합니다");
	}
	
	
	@Override
	void makeBaby() {
		System.out.println("나는 싱글입니다");
	}
	
	
}
