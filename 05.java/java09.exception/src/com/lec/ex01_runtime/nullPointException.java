package com.lec.ex01_runtime;

/*
	예외(Exception)?
	
	자바에서 응용프로그램의 오류가 발생하는 것을 에러(Error)라고 함.
	에러는 JVM이 실행중 문제가 발생하는 것으로, 결국 프로그램의 실행이 불가능하게 됨.
	이런경우 개발자는 프로그램이 정상적으로 실행될 수 있도록 해야하는데
	에러를 처리할 방법이 없다면 이를 대처할 수 없게 됨.
	
	대부분의 프로그램언어에선 이런 에러 이외에 예외(Exception)라고 불리는 오류가 있는데
	예외란 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 발생하느 프로그램 오류를 의미.
	
	예외가 발생하면 프로그램은 곧바로 종료가 된다는 점에서 에러와 동일하지만, 예외는 예외처리를
	통해 프로그램을 종료하지 않고 정상적인 실행상태가 유지될 수 있도록 함.
	
	예외는 2가지 종류가 있는데 일반예외(Exception)와 실행예외(Runtime Exception)이 있다.
	
	
	1. 일반예외
		컴파일예외라고 함. 자바소스를 컴파일하는 과정에서 예외처리코드가 필요한지 여부를 검사하기 때문.
		만약 예외처리코드가 없다면 컴파일에러가 발생함.
		
	2. 실행예외
		컴파일과정에서 예외처리코드의 유무를 검사하지 않는 예외. 실행예외는 자바컴파일러가
		예외를 체크하지 않으므로 오로지 개발자의 경험에 의해 예외처리를 해야함.
		만약, 개발자가 실행예외에 대한 처리를 하는 코딩을 안했을 경우 해당예되가 발생한다면
		프로그램은 곧바로 종료됨.
		
	일반예외와 실행예외는 컴파일시 처리하는지 안하는지 차이일 뿐, 2가지 모두 예외처리가 필요하다.
	자바에선 예외를 클래스로 관리한다.
	
	JVM은 프로그램을 실행하는 도중 예외가 발생하면 해당 예외클래스로 객체를 생성 후
	예외처리코드에서 예외객체를 이용할 수 있다.
	
	모든 예외클래스는 java.lang.Exception클래스를 상속받는다. 일반예외와 실행예외클래스를 구분하는 방법은
	일반예외는 Exception을 상속받지만 실행예외는 java.lang.RuntimeException을 상속받는다.
*/

public class nullPointException {

	public static void main(String[] args) {
		
		String data = null;
		
		// java.lang.NullPointerException예외는 객체의 참조가 없는 상태를 의미.
		// 즉, 객체가 없는 상태에서 객체를 참조하려 했으므로 예외가 발생하는것.
		System.out.println(data.toString());
		
		System.out.println("매우 중요한 처리로직을 실행");
		
		
	}

}
