package com.lec.ex08_wrapper;

/*
	포장클래스(Wrapper Class)
	
	java는 기본타입(byte, short, char, int ...)은 객체로 생성불가하므로 기본타입의 데이터를
	객체로 생성할 수 있도록 지원하는데, 이러한 객체를 포장객체라고 한다.
	기본타입의 값을 내부에 두고 포장하기 때문에 포장객체라고 부름
	
	포장객체는 포장하고 있는 내부의 기본타입의 값은 외부에서 변경할 수 없다. 만약
	내부의 값을 변경하고 싶을땐 새로운 포장객체를 만들어야한다.
	
	포장클래스는 java.lang패키지에 포함되어있는 각각의 기본타입에 대응하는 클래스가 있다.
	char와 int는 각각 Character와 Integer로 변경되고 나머지 기본타입은 첫 글자가 대문자로
	변경된 이름을 가지고있다.
	
	
	기본자료형 대신 포장클래스를 사용하는 이유
	
	1. 객체 또는 클래스가 제공하는 속성(필드, 메서드)를 사용할 수 있다.
	2. 클래스가 제공하는 상수를 사용할 수 있다.(MIN_VALUE or MAX_VALUE등)
	3. 숫자, 문자형으로 형변환 또는 진법전환때 사용할 수 있다
	
	
	Boxing, Unboxing
	
	기본타입의 값을 포장객체로 만드는 과정을 Boxing이라고 하고
	반대로 포장객체에서 기본타입의 값을 얻어내는 과정을 Unboxing이라 한다
	
	
	자동박싱과 언박싱
	
	기본타입의 값을 직접 박싱, 언박싱하지 않아도 자동으로 박싱과 언박싱이 되는 것을 의미.
	자동박싱은 포장클래스에 기본값이 대입이 되는 경우를 의미.
	자동언박싱은 기본타입에 포장객체가 대입되는 경우에 발생한다.
*/

public class WrapperMain1 {

	public static void main(String[] args) {
		
		// 1. 수동박싱
		// a. 생성자이용(deprecated)
		@SuppressWarnings("deprecated")
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		System.out.println("Integer 값의 범위 = " + obj1.MIN_VALUE + " ~ " + obj2.MAX_VALUE);
		System.out.println(obj2.toString());
		System.out.println();
		
		// b. valueOf()메서드 이용
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("100");
		
		@SuppressWarnings("deprecated")
		Double obj5 = new Double(3.14);
		Double obj6 = Double.valueOf(3.14);
		
		
		
		// 2. 언박싱
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
		int val4 = obj4.intValue();
		double val5 = obj5.doubleValue();
		double val6 = obj6.doubleValue();
		
		
		
		// 3. 자동박싱
		Integer obj7 = 100;
		System.out.println("value = " + (obj7.intValue() + 100));
		System.out.println(obj7 + " : " + (obj7.toString() + 100));
		
		
		
		// 4. 자동언박싱
		// a. 대입시 자동언박싱
		int val7 = obj7;
		System.out.println(val7);
		
		// b. 연산시 자동언박싱
		// b. 연산시 자동언박싱
		int result = obj7 + 200;
		System.out.println(result);
		
		
	}

}
