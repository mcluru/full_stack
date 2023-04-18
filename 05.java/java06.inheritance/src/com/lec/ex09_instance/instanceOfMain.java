package com.lec.ex09_instance;

/*
 	객체타입확인연산자(instanceof)
 	 강제타입변환은 자식객체에서 부모객체로 타입변환이 되어 있는 상태에서만 가능하므로
 	 부모타입의 변수가 부모객체를 참조할 경우 자식타입으로 변환할 수 있음
 	 
 	 Parent parent = new Parent();
 	 Child child = (Child) parent; <-강제형변환불가, ClassCastException 발생함
 	 
 	 instanceof연산자 좌측항은 객체, 우측항은 타입.
 	 좌측항의 객체가 우측항의 인스턴스(객체)가 아니면 false, 우측항의 타입으로 생성된
 	 인스턴스(객체)라면 true를 리턴.
 	 
 	 boolean result = 객체 instanceof 참조타입
 	 
 	 instanceof연산자는 매개값의 타입을 조사할 때 주로 사용. 메서드내에서 강제타입변환이
 	 필요한 경우 반드시 배개값이 어떤 타입인지 instanceof연산자로 확인 후 안전하게
 	 강제타입변환 해야함.
 	 
 	 타입확인 없이 강제타입변환을 시도할 경우 강제타입변환이 되지않으면
 	 ClassCastException예외가 발생함.
 	 
 	 
*/

public class instanceOfMain {

	public static void main(String[] args) {
		
		// 강제변환불가
//		Parent parent = new Parent();
//		Child child = (Child) parent;
		
		Parent parentA = new Child();	//자동형변환
		method1(parentA);
		method2(parentA);
		System.out.println();
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
		
		
	}


	
	private static void method1(Parent instance) {
		System.out.println(instance.getClass());
		if(instance instanceof Child) {
			Child child = (Child) instance;
			System.out.println("method1() - 강제형변환성공");
		} else {
			System.out.println("method1() - 강제형변실패");
		}
	}

	
	
	private static void method2(Parent instance) {
		System.out.println(instance.getClass());
		Child child = (Child) instance;
		System.out.println("method1() - 강제형변환성공");
	}
}
