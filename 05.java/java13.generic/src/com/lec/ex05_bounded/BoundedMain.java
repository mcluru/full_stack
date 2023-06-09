package com.lec.ex05_bounded;

/*
	제한된 파라미터(<T extend 상위타입>)
	
	타입파라미터에 지정되는 구체적인 데이터타입을 제한할 필요가 있을 경우,
	예를들어 숫자를 연산하는 제네릭메서드는 매개값으로 숫자타입만 전달되어야 한다.
	즉, 매개값을 Number or 하위클래스(Byte, Integer, Double ...)등의 참조타입(객체)만 전달되어야 한다.
	제한된 타입파라미터(Bounded Type Parameter)가 필요한 이유다.
	
	제한된 파라미터를 선언하려면 타입파라미터 뒤에 extends키워드를 선언하고 상위타입을 명시한다.
	상위타입은 클래스뿐 아닌 인터페이스도 가능하지만 implements가 아닌 클래스와 동일한 extends 키워드를 사용한다
	
	타입파라미터에 지정되는 구체적인 타입은 상위타입/상위타입을 상속 또는 구현한 하위클래스/하위인터페이스만 전달 가능.
 */

public class BoundedMain {

	public static void main(String[] args) {
		
		int result = Util.compare(10, 10);
		System.out.println(result);
		
		result = Util.compare(10.5, 10.0);
		System.out.println(result);
		
		result = Util.compare(10.5, 20.0);
		System.out.println(result);
		
//		result = Util.compare(10, "10"); (x)
		// Number와 하위타입만 대입하도록 제한(bounded)되어있기 때문에 에러
		
		result = Util.compare(20, 10);
		// 20, 10은 int타입이지만 Number의 하위타입이므로 대입이 가능
		// 내부적으로는 int가 Integer로 Boxing이 된 후 대입
		
		
	}

}


class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		Double x = t1.doubleValue();
		Double y = t2.doubleValue();
		return Double.compare(x, y);
	}
}