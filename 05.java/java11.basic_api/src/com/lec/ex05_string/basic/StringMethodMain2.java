package com.lec.ex05_string.basic;

import java.io.UnsupportedEncodingException;

public class StringMethodMain2 {

	public static void main(String[] args) {
		
		// 6. charAt
		String ssn = "991118-1234567";
		char gender = ssn.charAt(7);
		System.out.println(gender == '1' ? "남자" : "여자");
		
		switch(gender) {
		case '1' :
		case '3' :
			System.out.println("남자");
			break;
		case '2' : 
		case '4' :
			System.out.println("여자");
		}
		System.out.println(gender == '1' ? "남자" : (gender == '3' ? "남자" : "여자"));
		System.out.println();
		
		
		// 7. getBytes
		// a. getBytes()
		String str = "안녕하세요";	//utf-8 한글 3bytes, euc-kr/ms949 한글 2btyes
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length + "bytes");
		
		String str1 = new String(byte1);
		System.out.println("byte array(utf-8) -> string = " + str1);
		System.out.println();
		
		// b. getBytes(문자셋()
		try {
			byte[] byte2 = str.getBytes("EUC-KR");
			System.out.println(byte2.length + "bytes");
			String str2 = new String(byte2);
			System.out.println("byte array(euc-kr) -> string = " + str2);
			
			byte[] byte3 = str.getBytes("UTF-8");
			System.out.println(byte3.length + "bytes");
			String str3 = new String(byte3);
			System.out.println("byte array(utf-8) -> string = " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		// 8. indexOf
		// 매개값으로 주어진 문자열이 시작되는 위치(인덱스)를 정수로 리턴
		// 만약, 주어진 문자열을 찾지못하면 -1 리턴
		String 제목 = "매개값으로 주어진 문자열이 시작되는 위치";
		int loc = 제목.indexOf("문자열");
		System.out.println("문자열의 위치 = " + loc);
				
		loc = 제목.indexOf("이강인");
		System.out.println("이강인의 위치 = " + loc);
		
		if(제목.indexOf("이강인") >= 0) System.out.println("이강인 뉴스기사 검색결과가 있습니다");
		else System.out.println("이강인 뉴스기사 검색결과가 없습니다");
		
	}

}
