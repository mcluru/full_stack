package com.lec.ex06_type_change.typechange;

/*
	타입변환과 다형성
	
	다형성이란?
	동일타입이지만 실행결과가 다양한 형태의 객체를 이용할 수 있는 성질을 의미.
	프로그램측면에서 보면 다형성의 하나의 타입에 여러형태의 객체를 대입함으로서
	다양한 기능수행이 가능하게함.
	
	다형성을 위해 Java는 자식클래스의 부모클래스로 타입변환을 허용함. 즉 부모타입에
	모든 자식객체들을 대입할 수 있는 것. 이 기능을 이용해 모든 객체는 부품화가 가능해짐.
	
	--------------
	타입변환이란?
	데이터타입을 다른 데이터타입으로 변환하는 행위.
	기본 데이터타입의 변환처럼 참조타입(class, array, interface, enum)도 타입변환이 가능함.
	클래스타입변환은 직접적인 상속관계가 있는 클래스 사이에서만 타입변환 가능
	
	자동타입변환(promotion)은 프로그램실행 도중 자동적으로 타입변환이 일어나는 것.
	이 개념은 자식이 부모의 특징과 기능을 상속받아 부모와 동일하게 취급될 수 있다는 것.
	
	주의점은 자동타입변환 후 부모클래스에 선언된 필드와 메서드만 접근 가능함.
	비록 변수는 자식객체를 참조하지만 변수로 접근 가능한 멤버는 부모클래스의 멤버로만 제한됨.
	예외 ) 메서드가 자식클래스에서 오버라이딩 되었다면 부모클래스 메서드가 아닌 자식클래스 메서드가 호출됨
	
	
*/

public class promotionMain {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동형변환
		// 1. 직접상속관계가 있을 경우 - 가능
//		a = b;
//		a = c;
//		a = d;
//		a = e;
//		
//		b = d;
//		c = e;
		
		
		// 2. 직접상속관계가 없을 경우 - 불가능
//		b = e; (x)
//		c = d; (x)
		
		
		// 3. 메서드의 매개변수로 전달
		method_a(1);
		method_a("참조타입");
		
		method_a(a);
		method_a(b);
		method_a(c);
		method_a(d);
		method_a(e);
		System.out.println();
		
//		method_b(a);
		method_b(b);
//		method_b(c);
		method_b(d);
//		method_b(e);
	}
	
	static void method_a(double a) { System.out.println("정수형 = " + a); }
	static void method_a(String a) { System.out.println("참조타입(문자열) = " + a.getClass()); }
	static void method_a(A a) { System.out.println("A = " + a.getClass()); }
	static void method_b(B b) { System.out.println("B = " + b.getClass()); }
	
	
	

}
