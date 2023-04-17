package com.lec.ex02_supercall;

/*
	부모생성자호출(super call)
	  모든 객체는 클래스의 생성자를 호출해야 생성됨. 부모객체도 예외는 아님.
	  부모객체를 생성하기 위해선 자식생성자에서 부모생성자가 호출되어야함.
	  자식생성자에서 부모생성자를 호출할 경우 자식생성자의 맨 첫줄에 선언되고 호출되어야함.
	  
	  부모생성자가 명시적으로 선언되지 않았다면 컴파일에러 발생.
	  자식객체는 부모클래스의 생성자와 동일한 시그니터를 갖는 부모 생성자를 호출함.
	  만약 매개값의 시그니터와 일치하는 부모생성자가 없을 경우 컴파일에러 발생함.
	  
	  super(매개값...)가 생략되면 컴파일러는 부모의 기본생성자 super()가 자동으로 추가되므로
	  부모클래스에 기본생성자가 반드시 존재해야함.
	  
	  부모클래스에 기본생성자가 없고 일반생성자(매개값 유)가 있다면 자식생성자에선 반드시
	  부모생성자를 호출하기 위해 동일 시그니처를 갖는 super(매개값...) 생성자를 명시적으로
	  호출해야함. 또한 반드시 부모생성자의 호출은 자식생성자의 맨 첫줄에 위치해야함.
*/

public class Student extends People {

	int studentNo;

	
	public Student() {
		super();	//People의 기본생성자를 호출
	}


	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}


	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", ssn=" + ssn + "]";
	}
	
}
