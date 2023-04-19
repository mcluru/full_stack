package com.lec.ex01_runtime;

/*
	NumberFormatException
	
	프로그램 개발중엔 문자열로 되어있는 숫자형 데이터를 숫자로 변환하는 경우가 자주 발생한다.
	문자열을 숫자로 변환할 때 해당 문자열이 숫자로 구성된 문자열이 아닐 경우, 즉 숫자로
	변환할 수 없는 문자열일 경우 발생하는 예외다.
	
	문자열 -> 숫자 변환방법
		변환타입	메서드(매개변수)
		--------	----------------------------
		int			Integer.parseInt(String str)
		double		Double.parseDouble(String str)
*/

public class numberFormatExceptionMain {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "3.14";
		
		int val1 = Integer.parseInt(data1);
		double val2 = Double.parseDouble(data2);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val1+val2);
		System.out.println(data1+data2);
		
		String data3 = "100a";
		int val3 = Integer.parseInt(data3, 16);
		System.out.println(val3);
		
		val3 = Integer.parseInt(data3);
		System.out.println(val3);
	}

}
