package com.lec.exerxise.answer;

public class Exercise7_25 {

	public static void main(String[] args) {
		Outer out = new Outer();
		
		System.out.println(out.Inner.iv);
	}

}

class Outer {
	class Inner {
		int iv = 100;
	}
}