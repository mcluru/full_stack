package com.lec.ex14_singleton;

/*
	싱글톤(singleton) 디자인패턴
 	프로그램에서 단 한개의 객체만 생성되도록 할때 사용.
 	이렇게 생성된 객체를 singleton 객체라고 함
 	
 	싱글톤객체 만드는법
 	1. 외부에서 new연산자로 생성자 호출 불가하게 막아야함.
 		(생성자를 호출한만큼 객체가 생성되기 때문)
 		생성자에 접근제한자 private으로 선언하기
	2. 자신의 참조타입인 정적필드를 하나 선언하고, 자신의 객체를 생성해서 초기화함.
		이 객체를 외부에서 접근하지 못하도록 private로 선언.
	3. 생성된 객체를 외부에서 접근하도록 getter메서드를 선언해서
		생성된 객체를 리턴하도록 하여 외부에 전달할 수 있게 함
*/

public class Singleton {
	
	private Singleton() {}
	
	// 이것도 아무나 객체생성 가능해서 안됨
//	static Singleton xxx() {
//		return new Singleton();
//	}

	private static Singleton singleton = new Singleton();
	
	static Singleton getInstance() {
//		if(singleton == null) singleton = new Singleton();
		return singleton;
	}

	
}
