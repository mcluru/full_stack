package com.lec.ex03_compare;

public class stringEqualMain {

	public static void main(String[] args) {
		
		// string타입의 문자열 비교할 땐 대소(>,<,<=,>=)연산자 사용불가.
		// 동등(==, !=)연산자 사용가능하지만, 문자열이 동일여부 비교할땐 사용안함.(참조타입이기 때문)
		// String변수를 비교할 경우 동등연산자를 사용하면 원하지 않는 결과 나올 수 있음.
		
		String str1 = "소향";	//literal
		String str2 = "소향";	//literal
		String str3 = new String("소향");	//객체
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();
		
		
		// 비교연산자를 사용할 경우
		// 참조타입 비교연산시 동등연산자 사용 -> 값 비교가 아닌 참조하는값(주소)를 비교함
		System.out.println("str1 == str2 -> " + (str1 == str2));	//true
		System.out.println("str1 == str3 -> " + (str1 == str3));	//false
		System.out.println("str2 == str3 -> " + (str2 == str3));	//false
		System.out.println();
		
		// 자바는 문자열리터럴이 동일하면 동일한 String객체를 참조하도록 되어있음
		// 리터럴이 동일하면 Costant Pool에 한개의 값만 생성가능.
		// 따라서 str1, str2는 동일한 String객체의 값(주소)를 가짐.
		// 그러나 객체생성연산자인 new로 생성한 str3(참조타입, 객체)는 새로운 객체의 주소값을 가지고 있기 때문에 동등연산자로 비교하면 false결과가 나옴
		// 따라서, 참조타입인 String(객체)을 비교할 경우 동등연산자 대신 equals()메서드를 사용.
		System.out.println("str1.equals(str2) -> " + str1.equals(str2));
		System.out.println("str1.equals(str3) -> " + str1.equals(str3));
		System.out.println("str2.equals(str3) -> " + str2.equals(str3));
	}

}
