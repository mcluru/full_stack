package com.lec.ex01_class;

/*
	클래스
	
	1. 클래스 명명규칙
		1) 하나 이상의 문자로 이루어져야함.(한글도 가능하지만 영문사용이 관례)
		   단, 첫글자는 대문자로 새작해야함.
	    2) 첫글자 숫자 불가
	    3) $, _ 이외의 특수문자 사용불가
	    4) Java예약어(for, if...) 사용불가
	    
    2. 클래스를 선언하는 키워드 class는 반드시 소문자로 작성.
    3. 일반적으로 소스파일 하나당 한개의 클래스를 정의.
       여러 클래스선언 가능하지만 클래스당 한개의 ~.class파일이 각각 생성됨.
       단, public(접근제한자)은 소스파일명과 동일한 클래스에만 선언가능.
    4. 소스파일명과 class명을 동일해야함.
*/

public class Human {
	
	// 1. 속성(필드)
	String name;
	String gender;
	int age;
	String ssn;
	
	
	// 2. 생성자 : class이름과 동일
	Human() {}	// 기본생성자
	Human(String name) {
		
	}
	
	
	
	// 3. 메서드
	void think() {System.out.println("생각한다");}
	void eat() {System.out.println("식사한다");}
	void speak() {System.out.println("말한다");};
	void move() {System.out.println("움직인다");};
}
