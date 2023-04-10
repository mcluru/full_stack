package com.lec.ex01_op;

/*
	증감연산자(++, --)
	 변수의 값을 1씩 증가(++), 1씩 감소(--)시키는 연산자.
	 boolean타입 제외 모든 기본데이터타입의 피연산자에 사용 가능.
	 선언위치에 따라 후위, 전위 증감연산자로 구분됨.
	 	변수 앞에 정의 : 전위증감연산자
	 	변수 뒤에 정의 : 후위증감연산자
	 
	 전위연산자 : 연산전에 증감
	 후위연산자 : 연산후에 증감
	 
	 
	 ※ 주의점 ※
	 다른 연산자와 함께 사용되는 연산식에선 증감연산자의 위치에 따라 연산결과가 다름.
*/

public class incDecOperatorMain {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;	// x = x+1;
		++x;	// x = x+1;
		System.out.println("x = " + x);
		
		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("-------------------------");
		
		
		z = x++;
		System.out.println("z = " + z);		// z = 12
		System.out.println("x = " + x);		// x = 13
		System.out.println("-------------------------");
		
		
		z = ++x;
		System.out.println("z = " + z);		// z = 14
		System.out.println("x = " + x);		// x = 14
		System.out.println("-------------------------");
		
		
		z = ++x + y--;	// x=15, y=8
		System.out.println("z = " + z);		// z = 23
		System.out.println("x = " + x);		// x = 15
		System.out.println("y = " + y);		// y = 7
	}

}
