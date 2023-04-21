package com.lec.ex01_object.ex03_toString;

/*
	객체의 문자정보(toString())
	
	Object클래스의 toString()메서드는 객체의 문자정보를 리턴한다.
	객체의 문자정보란 객체를 문자열로 표현한 값을 의미. 기본적으로
	Object.toString()메서드는 "클래스명@16진수해쉬코드"로 구성된 문자열을 리턴한다
	
	Object.toString()메서드의 리턴값은 실제론 별 의미없는 정보이므로
	하위클래스에선 Object.toString()메서드를 재정의해서 간결하고 유익한
	정보를 리턴하도록 한다.
	  ex) 재정의된 java.util.Date.toString()메서드를 보면 현재의 시스템 날짜와
	  	  시간정보를 리턴한다. 그리고 String클래스의 toString()메서드는
	  	  저장하고 있는 문자열을 리턴한다.
*/

public class SmartPhone {
	
	private String company;
	private String os;
	
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}
	
	
	
	
	
}
