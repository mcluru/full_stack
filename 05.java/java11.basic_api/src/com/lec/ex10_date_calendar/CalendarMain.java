package com.lec.ex10_date_calendar;

import java.util.Calendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		// Calendar클래스는 추상클래스이기 때문에 new연산자 사용불가
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) +1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"."+month+"."+day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.MONDAY);
		switch(week) {
		case Calendar.MONDAY:System.out.println("월요일"); break;
		case Calendar.TUESDAY:System.out.println("화요일"); break;
		case Calendar.WEDNESDAY:System.out.println("수요일"); break;
		case Calendar.THURSDAY:System.out.println("목요일"); break;
		case Calendar.FRIDAY:System.out.println("금요일"); break;
		case Calendar.SATURDAY:System.out.println("토요일"); break;
		case Calendar.SUNDAY:System.out.println("일요일"); break;
		}
		
		int ampm = now.get(Calendar.AM_PM);
		if(ampm == Calendar.AM) {
			System.out.println("오전입니다");
		} else {
			System.out.println("오후입니다");
		}
		
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(hour+":"+minute+"."+second);
		
		
		
	}

}
