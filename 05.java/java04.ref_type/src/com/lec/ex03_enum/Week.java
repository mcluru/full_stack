package com.lec.ex03_enum;

/*
	열거타입
	데이터중엔 특정의 한정된 값만 갖는 경우가 많음. 이걸 "열거타입 Enumeration Type, enum"이라 함
	 ex)요일 : "월~일" 7개의 값
	 	계절 : "봄~겨울" 4개의 값
 	
 	열거타입 선언
 	먼저 열거타입 이름 정의 후 열거타입이름의 소스파일(~.java) 생성해야함.
 	
 	열거타입 이름
 	첫글자는 대문자, 나머지는 소문자가 관례.
 	여러 단어로 구성됐다면 단어의 첫글자는 대문자로 함.
 	
 	열거타입의 값은 상수의 성격을 가짐.
 	따라서 상수 선언처럼 모두 대문자며 언더바(_)로 연결하는 스네이크케이스를 따름
 	
*/
public enum Week {
	MONDAY,
	TUESDAY,
	WENDSDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}
