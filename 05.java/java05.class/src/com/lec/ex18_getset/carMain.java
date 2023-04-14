package com.lec.ex18_getset;

public class carMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		// car객체의 필드(속성)은 캡슐화(은닉화, private)
//		car.speed = 10000;
//		car.stop = true;
		
		car.setSpeed(101);
		System.out.println(car);
		car.isStop();
		System.out.println();


		car.setSpeed(20);
		System.out.println(car);
		car.isStop();
		System.out.println("----------------------------");
		
		
		// car의 객체의 속성 은닉화되어있어 접근불가
//		System.out.println(car.speed);
		car.setSpeed(90);
		int speed = car.getSpeed();
		System.out.println("현재 운행속도는 " + speed + "km/h 입니다");
		
		car.isStop(true);
		if(!car.getStop()) {
			System.out.println("현재 " + speed + "km/h 속도로 운행중입니다");
		} else {
			System.out.println("현재 운행정지");
		}
		
		
		
	}

}
