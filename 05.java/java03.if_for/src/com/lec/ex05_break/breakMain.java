package com.lec.ex05_break;

public class breakMain {

	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			if(num==6) break;
			System.out.println("주사위번호 = " + num);
			
		}
		System.out.println("주사위던지기 종료");
		
	}

}
