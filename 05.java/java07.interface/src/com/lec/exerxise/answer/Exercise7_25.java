package com.lec.exerxise.answer;

public class Exercise7_25 {

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner inner = out.new Inner();
		
		System.out.println(inner.iv);
	}

}

class Outer {
	class Inner {
		int iv = 100;
	}
}