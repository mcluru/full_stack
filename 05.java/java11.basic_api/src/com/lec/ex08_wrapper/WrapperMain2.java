package com.lec.ex08_wrapper;

public class WrapperMain2 {

	public static void main(String[] args) {
		
		// 포장객체비교
		// 포장객체는 내부값을 비교하기 위해 동등연산자(==, !=)를 사용할 수 없다.
		// 동등연산자는 내부의 값으로 비교하는 것이 아니라 포장객체의 참조주소로 비교하기 때문
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("언박싱전 비교결과 = " + (obj1 == obj2));	//false
		
		// 따라서, 내부의 값만 비교하려면 언박싱한 값을 비교해야 한다.
		System.out.println("언박싱후 비교결과 = " + (obj1.intValue() == obj2.intValue()));	//true
		System.out.println("equals메서드결과 = " + obj1.equals(obj2));	//true
		System.out.println();
		
	}

}
