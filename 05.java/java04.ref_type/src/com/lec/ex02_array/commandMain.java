package com.lec.ex02_array;

public class commandMain {

	public static void main(String[] args) {
		// ~.java -> javac.exe -> ~.class -> java.exe 실행
		// 외부에 ~.class파일을 실행하기 위해 'c:\yourfolder\java.exe 클래스실행파일' 형식으로 실행
		// 	 ex) 덧셈연산 클래스실행파일이 있을 경우, 외부에서 2개의 피연산자를 전달해야함.
		// 일반적으로 메서드를 호출할 때 매개변수의 갯수만큼 전달하는 것처럼 ~.class파일에 매개변수는 배열로 전달됨.
		
		// 외부에서 매개변수 전달하는 방법 : 'c:\yourfolder\java.exe 클래스실행파일 값1 ... 값n'
		
		int[] val = {1,2};
		System.out.println("val[0] + val[1] = " + (val[0] + val[1]));
		System.out.println("배열의 크기 : " + args.length);
		System.out.println("args[0] + args[1] = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
		System.out.println();
		
		int sum = 0;
		for(String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("1~10까지 합 : " + sum);
		
		
	}

}
