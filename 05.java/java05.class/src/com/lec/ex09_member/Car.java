package com.lec.ex09_member;

/*
 	클래스의 멤버
 	
 	1. 필드(field, 속성, 클래스변수)
 		객체의 고유속성을 저장하는곳.
 		선언방법은 변수와 유사하지만 변수라고 칭하지 않음.
 			변수 : 생성자와 메서드내에서만 사용.
 				   생성자와 메서드 실행이 종료되면 자동소멸
 			필드 : 생성자와 메서드뿐만 아닌 전역적으로(전역변수개념) 사용되고
 				   객체의 소멸 전까지 객체와 함께 메모리에 존재하고 같이 소멸됨.
 		
 	2. 메서드(method, 기능, 동작의 역할)
 		메서드는 객체의 동작(기능, 행위)에 해당하는 실행 블럭.
 		이름을 부여하고 이름으로 메서드 호출 -> 블럭내부 실행문 일괄실행
 		-> 호출한 곳으로 결과 리턴하는 역할
 		
 	3. 생성자(Constructor, 객체의 초기화)
 		new 객체생성연산자로 호출되는 특별한 블럭. 생성자의 역할은 객체생성할 때
 		객체의 초기화 담당. 즉, 필드를 초기화하거나 메서드 호출해서
 		객체 생성할 수 있게 함.
 		
 		- 기본생성(default constructor)
 		모든 클래스는 한개 이상의 생성자가 반드시 존재해야함.
 		단, 복수의 생성자 정의할때 매개변수의 갯수, 데이터타입 및 순서가 달라야함
 		동일한 형태의 시그니처를 갖는(중복되는) 생성자 정의 불가.
 		
 		기본생성자는 별도정의 없어도 컴파일러(javac.exe)가 컴파일시 자동 추가함.
 		개발자가 기본생성자가 아닌 생성자 별도 정의할 경우 자동추가 안됨.
 		따라서 기본생성자 외 다른생성자를 정의하고 기본생성자가 필요하면 기본도 따로
 		정의해야함.
 		
 		클래스가 public접근제한자로 선언되어있다면 기본생성자도 자동으로 public으로 선언되나,
 		클래스가 public선언이 안됐다면 기본생성자도 public으로 선언되지 않음.
*/

public class Car {
	
	// 1. 필드
	String company = "벤츠";
	String model;
	String color;
	int maxSpeed = 300;
	int speed;
	
	// 2. 생성자
	Car() {
		System.out.println("기본생성자가 호출되었습니다");
	}
	public Car(String model) {
		this.model = model;
		System.out.println("문자열(" + model + ") 생성자가 호출되었습니다");
	}
	Car(int speed) {
		this.speed = speed;
		System.out.println("숫자형(" + speed + ") 생성자가 호출되었습니다");
	}
	Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
		System.out.println(this.model + ", " + this.speed + "형태의 생성자가 호출되었습니다");
	}
	Car(int speed, String model) {
		this.speed = speed;
		this.model = model;
		System.out.println(this.speed + ", " + this.model + "형태의 생성자가 호출되었습니다");
	}
	public Car(String model, String color, int maxSpeed, int speed) {
//		super();	// 부모생성자, 생략가능
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
	
	
	// 3. 메서드
	void powerOn() {}
	void run() {}
	void stop() {}
	void powerOff() {}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	
	
	
	}
	
}
