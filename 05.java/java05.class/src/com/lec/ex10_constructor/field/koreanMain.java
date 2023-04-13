package com.lec.ex10_constructor.field;

public class koreanMain {

	public static void main(String[] args) {
		
		Korean hong = new Korean("홍길동", "951118-1234567");
		System.out.println(hong.toString());
		System.out.println(hong.result);
		System.out.println(hong.add(2000,5000));
		// 필드의 속성이 변경되는게 아닌 메서드만 호출한 것.
		// hong객체의 result속성은 변경되지 않음
		System.out.println(hong.result);
		
		
		
	}

}
