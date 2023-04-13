package com.lec.ex11_mathod.declare;

public class calculatorMain {

	public static void main(String[] args) {
		
		// Calculator객체를 생성하고 add~div까지 구현
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int add = cal.add(4, 2);
		int sub = cal.sub(4, 2);
		int mul = cal.mul(4, 2);
		int div = cal.div(4, 2);
		
		System.out.println("add = " + add);
		System.out.println("sub = " + sub);
		System.out.println("mul = " + mul);
		System.out.println("div = " + div);
		
		cal.powerOff();
		
		String result5 = cal.xxx(false);
		System.out.println(result5);
		
		String result6 = cal.yyy();
		System.out.println("yyy = " + result6);
		
		Calculator result7 = cal.zzz();
		System.out.println("result7 = " + result7.add(2352352, 346436));
		System.out.println("result7 = " + result7.div(2352352, 346436));
	}

}
