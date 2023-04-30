package com.lec.exerxise.answer;

public class Exercise7_27 {

	public static void main(String[] args) {
		
		//알맞은 코드쓰기
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		
		inner.method1();
		
		
	}

}

class Outer3 {
	int value = 10;
	
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	}
}