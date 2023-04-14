package com.lec.ex13_static;

public class koreanMain {

	public static void main(String[] args) {
		
		Korean kim = new Korean("김갑순", "991118-1234567");
		System.out.println(kim);
		kim.nation = "미국";
		
		Korean hong = new Korean("홍길동", "991118-2345678");
		System.out.println(hong);
		
		Korean park = new Korean("박길동", "991118-2345678");
		Korean son = new Korean("손길동", "991118-2345678");
		System.out.println(park);
		System.out.println(son);
		
		Korean.nation = "중국";
		Korean jung = new Korean("정길동", "991118-1234567");
		System.out.println(jung);
		
	}

}
