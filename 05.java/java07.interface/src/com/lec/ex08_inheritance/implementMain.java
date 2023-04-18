package com.lec.ex08_inheritance;

public class implementMain {

	public static void main(String[] args) {
		
		implementC im = new implementC();
		im.methodA();
		im.methodB();
		im.methodC();
		System.out.println();
		
		interfaceA ia = im;	//interfaceA로 자동형변환
		ia.methodA();
//		ia.methodB();	(x)
//		ia.methodC();	(x)
		System.out.println();
		
		
		interfaceB ib = im;	//interfaceB로 자동형변환
//		ib.methodA();	(x)
		ib.methodB();
//		ib.methodC();	(x)
		System.out.println();
		
		
		interfaceC ic = im;	//interfaceB로 자동형변환
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
		
		
	}

}
