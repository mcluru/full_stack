package com.lec.ex11_mathod.declare;

/*
	메서드(method)
	
	객체의 동작에 해당하는 중괄호{}블럭을 가짐.
	중괄호블럭이 가진 이름이 메서드이름.
	메서드를 호출하면 중괄호블럭의 실행문이 일괄실행됨
	
	메서드 1) 필드를 읽거나 수정
		   2) 다른 객체 생성해서 다양한 기능 수행.
	   객체간의 데이터 전달 수단으로 사요오디며, 외부로부터 매개값을 받을 수 있고
	   실행 후 그 결과를 리턴할 수 있음
	   
    1. 메서드선언
    	선언부와 실행부로 구성.
    	선언부(매서드 시그니처 - method signature)에는
    		접근제한자, 리턴타입, 메서드이름과 매개변수 등을 선언함
		실행부는 중괄호블럭을 의미
    
    2. 리턴타입
    	메서드가 실행한 결과를 리턴할 때 그 값의 데이터타입을 의미.
    	메서드는 리턴값이 있을수도, 없을수도 있음.
    	리턴값이 없는 경우엔 리턴타입을 void로, 있을땐 반환될 값의 데이터타입(기본/참초)을 정의.
    	
    
    3. 메서드 명명규칙
    	1) 숫자로 시작불가
    	2) $,_를 제외한 특수문자 사용불가
    	3) 관례로 메서드이름은 소문자로 시작
    	4) 카멜케이스를 준수
*/

public class Calculator {
	
	// 실습. 사칙연산을 하는 기능을 가진 계산기 클래스 구현하기
	// powerOn, add, sub, mul, div, powerOff 메서드를 구현
	// powerOn/Off를 제외한 4개의 메서드는 리턴값이 있게 구현
	
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	
	public int add (int x, int y) {
		return x+y;
	}
	public int sub (int x, int y) {
		return x-y;
	}
	public int mul (int x, int y) {
		return x*y;
	}
	public int div (int x, int y) {
		return x/y;
	}
	
	String xxx(boolean val) {
		if(val) {
			return "true : 참조타입 String(문자열)을 반환했습니다";
		} else {
			return "false : 참조타입 String(문자열)을 반환했습니다";
		}
	}
	
	String yyy() {
		return new String("참조타입");	//객체리턴
	}
	
	Calculator zzz() {
//		Calculator cal = new Calculator();
//		return cal;
		return new Calculator();
	}
	
	
	
}
