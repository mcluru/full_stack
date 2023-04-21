package com.lec.ex03_system;

import java.util.Map;

/*
	System 클래스
	
	자바프로그램은 운영체제에서 실행되는 것이 아니라 JVM위에서 실행되므로
	운영체제의 모든 기능을 자바코드가 직접 수행(개발)하기란 매우 어려움.
	하지만 java.lang.System클래스를 이용하면 운영체제의 일부기능들을 이용가능.
	
	프로세스의 종료(exit), 키보드입력(scanner()), 콘솔입출력(in(), out()), 메모리정리(gc())
	현재시간(nanoTime()...)등의 정보를 얻을 수 있다
	
	1. 프로그램 종료(exit())
		프로세스(JVM)을 강제로 종료시킬 필요가 있는 경우가 있다. 이때 System.exit(int)메서드를
		호출하면 현재 실행중인 프로세스를 강제로 종료시킬 수 있다.
		
		exit()메서드는 int매개값을 지정하도록 되어있는데, 이 값을 종료상태값이라고 한다.
		정상종료는 0, 비정상종료는 "0이외의 값"을 지정한다

	
	2. 쓰레기수집(gc())
		개발자가 직접 코드를 실행시킬 수 없고 JVM에게 가능한 빠른 시간내에 실행하도록
		요청할 수 있다. 이 기능을 하는 것이 System.gc()메서드다.
		gc메서드는 호출시 바로 실행되는게 아닌 JVM이 빠른 시간대에 실행시키기 위해 노력한다.
		
		
	3. OS환경정보(getenv())
		시스템 운영체제의 환경정보를 읽을 수 있다
		
		
	4. 현재시간(currentTimeMills(), nanoTime())
		System클래스의 currentTimeMills, nanoTime메서드는 컴퓨터시계로부터 현재시간을 읽어서
		밀리세컨드(1/1000), 나노세컨드(1/10*9)단위의 long타입의 값을 리턴한다.
		이 메서드는 주로 프로그램의 소요시간을 측정하는데 사용된다
*/

public class SystemMain {

	public static void main(String[] args) {
		
		// 1. exit()
		if(args.length > 3) {
			System.out.println("프로그램 비정상종료");
			System.exit(1000);
		}
		
		// 2. gc()
		Employee emp = null;
		for(int i=0;i<3;i++) {
			emp = new Employee(i);
			if(i==1) emp = null;
		}
		System.out.print("emp가 최종적으로 참조하는 사원번호 = ");
		System.out.println(emp.empno);
		System.gc();
		System.out.println();
		
		// 3. getenv()
		String java_home = System.getenv("JAVA_HOME");
		System.out.println(java_home);
		System.out.println(System.getenv("java_home"));	//대소문자 구분안함
		System.out.println();
		
		// os의 환경정보
		for(Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		
		System.out.println("프로그램종료");
		
		
	}

}


class Employee {
	int empno;
	
	public Employee(int empno) {
		this.empno = empno;
		System.out.println("Employee(" + this.empno + ")가 메모리에 생성되었습니다");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + this.empno + ")가 메모리에서 제거되었습니다");
	}
}
