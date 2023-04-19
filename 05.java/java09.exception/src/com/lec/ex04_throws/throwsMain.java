package com.lec.ex04_throws;

/*
	예외를 떠넘기기(throws)
	 메서드 내부에서 예외가 발생할 경우 코딩할땐 try~catch로 예외처리를 하는 게 기본.
	 하지만 경우에 따라 메서드를 호출할 곳으로 예외를 떠넘길 수 있다.
	 이때 사용하는 명령이 "throws"다. throws명령은 메서드 선언부에 작성되어 메서드에서
	 처리하지 않고 메서드를 호출한 곳으로 예외를 떠넘기는 역할을 한다.
	 
	 throws명령은 떠넘길 예외클래스를 콤마(,)로 구분해서 나열한다. throws키워드가 붙어있는
	 메서드는 반드시 try~catch블럭에서 떠넘겨받은 예외처리를 해야한다
	 (떠넘기면 호출한 블럭에서 또 떠넘길 수 있음)
	 
*/

public class throwsMain {
											// 예외가 여러개면 예외들의 최상위부모 Exception으로 단축 가능
	public static void main(String[] args) throws Exception  {
		
//		Class _class = Class.forName("java.lang.Stringxxxx");
//		String data = args[0];
//		int val1 = Integer.parseInt("111a");
		
		method();
		
	}

	private static void method() throws ClassNotFoundException {
		Class _class = Class.forName("java.lang.Stringxxxx");
	}
	
	void method1() {
		try {
			method();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	

}
