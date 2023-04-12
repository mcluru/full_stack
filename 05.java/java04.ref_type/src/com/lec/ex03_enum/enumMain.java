package com.lec.ex03_enum;

import java.util.Calendar;

public class enumMain {

	public static void main(String[] args) {
		
		String str = new String("소향");
//		Week today = new Week();	//enum은 객체생성 불가.(객체화, 인스턴스화 불가)
		// Week열거타입을 선언했다면 열거타입을 호출해서 사용가능
		// 열거타입은 하나의 데이터타입(참조타입, 사용자가 정의한 새로운 데이터타입)이므로 변수로 선언하고 사용해야함.
		// 	 열거타입변수를 선언했다면 열거상수를 저장하거나 사용 가능
		// 열거상수는 단독으로 사용 불가. "열거타입.열거상수"형태로 사용해야함.
		// 	 ex) Week.MONDAY
		Week today = null;
		System.out.println(today.MONDAY);
		
		// 현재의 요일 확인하기
		// calendar를 이용해 날짜 제어 가능. Calendar는 String이나 System 과 같은 기본클래스.
		Calendar cal = Calendar.getInstance();	// new연산자를 사용하지 않고 getInstance()메서드로 객체화함.
		System.out.println(cal);
		System.out.println(cal.toString());
		cal.get(Calendar.DAY_OF_WEEK);	//DAY_OF_WEEK: 현재의 요일을 int로 리턴
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		// 1:일, ... 7:토
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘은 " + today + "입니다");
		
		
		// 사원테이블에서 주민번호 7번째로 남,여 구분
		int gender = 1;	//7번쨰 값을 가져왔다
		if(gender == 1 || gender == 3) {
			System.out.println("이 사원은 " + Gender.남자 + "입니다");
		}
		
	}

}
