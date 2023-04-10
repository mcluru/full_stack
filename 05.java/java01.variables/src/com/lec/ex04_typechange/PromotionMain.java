package com.lec.ex04_typechange;

/*
 	형변환(Casting, Promotion)이란?
 	모든 리터럴과 변수는 데이터타입이 있음. 프로그램 작성 시 서로 다른 데이터타입의 값을 연산하는 경우가 빈번한데,
 	모든 연산은 기본적으로 동일타입의 데이터만 연산가능하기 때문에, 서로 다른 타입의 연산을 수행하는 경우엔 연산수행 전 형변환을 통해
 	동일 데이터타입으로 변화해야함
 	
 	형변환 : 변수 또는 리터럴의 데이터타입을 다른 타입으로 변환하는 것
 			 큰 -> 작은 타입으로 변환 : '강제형변환(Casting, 명시적)'
 			 작은 -> 큰 타입으로 변환 : '자동형변환(Promotion, 묵시적)'
	
	
	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
 
	
	자동형변환은 개발자가 별도로 정의안함.
				 ex) double d1 = int_value + double_value; 		//int_value가 double로 자동형변환 수 연산결과가 double로 저장됨
	수동형변환은 개발자가 명시적으로 선언함.(Casting방법)
				 데이터타입 변수명 = (데이터타입) 값 [or 표현식(변수명 or 연산수행)]
				 ex) double d1 = (double) int_value + double value;
				 ex) double d1 = int_value + (int) double_value;
				 ex) double d1 = (double)(int_value + (int) double_value);

 */

public class PromotionMain {

	public static void main(String[] args) {
		
		// 2. 자동형변환
		byte b1 = 10;	// 강제형변환
		int i1 = b1;	// 자동형변환
		System.out.println("i1 = "+i1);
		
		char c1 = '가';
		i1 = c1;		//자동형변환
		System.out.println("i1 = "+i1);
		
		long l1 = i1;
		System.out.println("l1 = "+l1);
		
		long f1 = l1;
		System.out.println("f1 = "+f1);
		
		long d1 = f1;
		System.out.println("d1 = "+d1);
		
		
		
		
		
		
		
		
		
		
	}

}
