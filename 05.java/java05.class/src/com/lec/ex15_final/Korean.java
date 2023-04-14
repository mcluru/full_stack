package com.lec.ex15_final;

/*
	final필드와 static final(상수)필드
	
	1. final 필드
		final의 의미는 최종적이란 뜻.
		final필드는 초기값이 지정되면 더이상 수정 불가함
		
		final필드의 초기값 지정방법
		1) 필드선언 시 초기값 부여
		2) 생성자를 통해 객체생성 시 final필드에 초기값 부여하는 방법
		
		단순값이라면 필드선언시 부여하는 것이 가장 간단.
		복잡한 초기화코드가 필요하거나 객체 생성시 외부 데이터로 초기화해야할 경우
		생성자에서 객체가 생성될 때 초기값을 부여함.
		
		생성자는 final필드를 초기화해야하는데, 만약 초기화가 안된 final필드가 있을경우
		컴파일(문법)에러 발생.
		
		
	2. static final 필드
		일반적으로 상수란 불변의 값을 뜻함. 불변값은 월주율의 PI값, 지구의 둘레 등이 해당됨.
		이런 불변의 값을 저장하는 필드를 자바에서 상수(constant)라고 함.
		final필드는 한번 초기화 후 변경 불가한 필드지만 상수라고 안함.
		왜냐하면 불변값은 객체마다 저장할 필요가 없는 공통으로 사용되는 값으로, 여러가지 값으로
		초기화될 수 없기 때문.
		
		final필드는 객체마다 저장되고 생성자의 매개값을 통해 여러가지 값을 객체별로 가질 수 있어
		상수가 될 수 없음
		
		따라서 Java에서의 상수는 final이면서 static이어야함. static은 정적멤버이므로
		객체마다 저장되지 ㅇ낳고 클래스에만 포함됨. 또한 한번 초기화되면 그 이후
		수정 불가함.
		
		
		
		
		
*/

public class Korean {
	
	static final String NATION = "대한민국";	//1. 초기화방법(1)
	String name;
	final String ss;
	
	public Korean(String name, String ss) {		//2. 초기화방법(2)
		this.name = name;						//source-field
		this.ss = ss;
	}

	@Override
	public String toString() {
		return "Korean [NATION = " + NATION + ", name=" + name + ", ss=" + ss + "]";
	}
	
	
	
	
	
	
	
}
