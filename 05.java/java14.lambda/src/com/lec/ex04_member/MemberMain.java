package com.lec.ex04_member;

/*
	클래스(static)멤버와 로컬(인스턴스, 객체)멤버
	
	람다식의 실행블럭에서는 클래스멤버(필드, 메서드), 로컬멤버(필드, 메서드)를
	사용가능. 클래스멤버는 제약없이 사용할 수 있지만 로컬멤버는 객체가 생성된 후 사용가능하다는 제약이 있다
	
	클래스 멤버를 사용할때 this키워드를 사용할 경우 일반적으로 익명객체내부에서 this는 익명객체를 참조하지만
	람다식에서는 내부적으로 생성되는 익명객체가 아닌 람다식을 실행한 객체를 의미한다
	
	
 */

public class MemberMain {

	public static void main(String[] args) {
		
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
		
		
	}

}

