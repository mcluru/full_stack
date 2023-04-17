package com.lec.ex08_casting;

/*
 	참조타입의 강제타입변환(Casting)
 	부모타입을 자식타입으로 변환하는 것.
 	형변환이 된다고 모든 부모타입이 자식타입으로 강제형변환할 수 있는 것은 아님
 	
 	강제타입변환이 되는 경우는 자식타입이 부모타입으로 형변환이 된 후에 자식타입으로
 	변환되는 경우에만 가능.
 	
 	자식타입이 부모타입으로 자동형변환하면 부모타입에 선언된 필드와 메서드만 사용가능.
 	만약, 자식타입에 선언된 필드와 메서드를 꼭 사용해야하는 경우 강제형변환해서
 	다시 자식타입으로 변호나 후 자식타입의 필드와 메서드 사용 가능함.
*/

public class castingMain {

	public static void main(String[] args) {
		
		// 1. 자동형변환
		Parent parent = new Child();	//생성즉시 자동형변환
		parent.field1 = "사용가능";
//		parent.field2 = "사용불가";		//사용불가
		parent.method1();
		parent.method2();	// 사용할 수 있지만 child에서 재정의
//		parent.method3();	// (x)
		System.out.println();
		
		
		// 2. 강제형변환
		// 1) 형변환불가
		// 직접생성한 부모객체에서 자식객체로 형변호나하는 경우는 불가
		// 자식객체 -> 부모형객체 -> (부모타입)자식객체의 순서로 형변환하는 것은 가능하지만
		// 부모객체 -> (부모타입)자식객체로 직접 형변환은 불가능.
		
		int val = (int)1.0;	//강제형변환
		Parent parent2 = new Parent();
		
		// 문법에러는 아니지만 실행시 에러 발생
		// java.lang.ClassCastExcption 발생
//		Child child = (Child)parent2;
		
		
		
		// 2) 형변환가능
		Child child = (Child)parent;
		child.field1 = "사용가능";
		child.field2 = "사용가능";
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		
		System.out.println("parent2 = " + parent2.getClass());
		System.out.println("parent = " + parent.getClass());
		System.out.println("child = " + child.getClass());
		System.out.println();
		
		System.out.println(parent == child);	//true
		System.out.println(parent2 == child);	//false, 이 경우엔 강제형변환 안하도록 로직에 반영해야함
		
		
		
		
		
		
		
		
	}

}
