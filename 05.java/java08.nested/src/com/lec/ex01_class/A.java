package com.lec.ex01_class;

public class A {
	
	// 생성자
	public A() { System.out.println("A 객체생성"); }

	// 1. 객체멤버인 중첩클래스
	//	  즉, A가 생성되어야만 사용가능
	public class B {
		// 필드
		int b_field;
//		static int b_field1;
		// 중첩클래스 B가 A의 객체멤버이므로 static선언 불가
		
		// 생성자
		public B() { System.out.println("B 객체생성"); }
		
		// 메서드
		void b_method() { System.out.println("B.b_method() 호출 - " + b_field); }
//		static void b_method1() {}	//static 선언불가
	}
	public class B1 {}
	
	
	
	// 2. 정적(클래스)멤버인 중첩클래스
	//	  즉, A가 생성되지 않아도 접근가능한 클래스
	public static class C {
		String c_field1;
		static String c_field2;
		public C() { System.out.println("C 객체생성"); }
		void c_method1() { System.out.println("C.c_method1() 호출 - c_field1 = " + c_field1 + ", c_field2 = " + c_field2); }
		static void c_method2() { System.out.println("C.c_method2() 호출 -  c_field2 = " + c_field2); }
	}
	public static class C1 {}
	
	
	
	// 3. 로컬중첩클래스
	public void a_method() {
		class D {
			String d_field1;
//			static String d_field2;	// (x)
			public D() { System.out.println("D 객체생성"); }
			void d_method1() { System.out.println("D.d_method1() 호출"); }
//			static void d_method2() {}	// (x)
		}
		D d = new D();
		d.d_field1 = "접근가능";
		d.d_method1();
		class E {}
		class F {}
		class G {}
	}
	
	public void a1_method() {
		class D {}
		class E {}
		class F {}
		class G {}
	}
}
