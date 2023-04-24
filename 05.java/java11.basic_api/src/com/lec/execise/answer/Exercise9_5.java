package com.lec.execise.answer;

public class Exercise9_5 {
	
	public static int count(String src, String target) {
		int count = 0;	//찾은 횟수
		int pos = 0;	//찾기 시작할 위치
		
		
		while(src.indexOf(target, pos) != -1) {
		count ++;
		System.out.println(src.indexOf(target, pos));
		pos = src.indexOf(target, pos)+target.length();
		
		}
		return count;
		
		

	}

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
		
		
	}

}
