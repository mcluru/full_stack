package com.lec.execise.answer;

public class Exercise9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		
		/*
		 알맞은 코드 넣어서 완성
		 */
		
		int num = fullPath.lastIndexOf("\\");
		if(num!=-1) {
			path = fullPath.substring(0,num);
			fileName = fullPath.substring(num+1);
		}
		
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
		
	}

}
