package com.lec.ex13_static;

/*
	정적메서드와 정적블럭 사용시 주의점
	
	정적메서드와 정적블럭을 선언할때 객체가 생성되지 않아도, 즉 객체가 없어도 실행되기 때문에
	정적메서드와 정적블럭 내부에 인스턴스필드나 인스턴스멤버 사용 불가함.
	객체 자신의 참조키워드인 this도 사용불가.
	
	정적메서드와 정적블럭에서 객체멤버 사용하고 싶으면
	먼저 객체 생성 후 참조변수로 접근해야함.
	
	main메서드도 정적메서드이므로 동일한 규칙 적용됨. 때문에 main메서드도 객체생성 없이
	객체멤버(필드와 메서드)를 바로 사용불가함.
*/

public class carMain {
	
	int speed;
	void run() {
		System.out.println("현재속도 " + speed + "km/h로 주행합니다");
	}
	public static void main(String[] args) {
		
		// speed와 run은 객체멤버이므로 정적멤버인 main에서 접근불가
//		speed = 100;
//		run();
		
		carMain car = new carMain();
		car.speed = 100;
		car.run();
		
		
		
	}

}
