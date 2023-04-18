package com.lec.ex08_inheritance;

public class implementC implements interfaceC {

	@Override
	public void methodA() {
		System.out.println("interfaceA.methodA()를 구현");
	}

	@Override
	public void methodB() {
		System.out.println("interfaceB.methodB()를 구현");
	}

	@Override
	public void methodC() {
		System.out.println("interfaceC.methodC()를 구현");
	}
	
	
	
}
