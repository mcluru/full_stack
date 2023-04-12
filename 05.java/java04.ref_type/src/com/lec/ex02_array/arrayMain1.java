package com.lec.ex02_array;

/*
	1. 배열이란?
		동일 데이터타입의 데이터를 연속된 공간에 배치시키고 각 데이터의 요소에 인덱스를 부여해 저장하는 자료구조.
		
		변수는 한개의 값만 저장가능. 하지만 저장할 데이터수가 많아지면 그만큼 변수가 필요한데, 이는 비효율적임.
		동일타입의 많은 데이터를 사용할 경우 더 효율적인 방법으로 데이터를 저장하기 위해 배열(Array) 사용함.
		
	2. 배열의 선언방법
		1) 데이터타입[] 변수명	->관례
		2) 데이터타입 변수명[]
		
		대괄호([])는 배열을 선언하는 기호. 데이터타입 또는 변수명 뒤에 선언가능.
		배열은 참조타입, 즉 객체이므로 배열이 생성될 때 객체는 힙메모리영역에, 배열변수는 스택영역에 생성되어
		변수는 배열객체가 저장된 힙영역의 메모리주소를 참조함.
		참조할 배열객체가 없다면 배열변수는 null값으로 초기화할 수 있음.
		
	3. 배열의 생성방법
		1) 값 목록으로 생성 : 중괄호{} 안에 값의 항목(요소, element)을 가지는 객체로 생성.
			데이터타입[] 변수명 = {값1,...값n};
			 ex) int[] scores = {값1,...값n};
		
		2) new연산자로 생성 : new객체 생성연산자로 생성된 배열은 기본값으로 데이터타입별(기본타입)/null(참조타입) 로 초기값이 저장되므로
							  배열생성 후 값을 저장해야함.
							  값이 저장되지 않은 배열 요소에 접근하려면 NullPointerException이 발생. 값을 저장하려면 scores[0] = 100;처럼
							  대입연산자를 이용해 해당 요소에 값 저장함
			데이터타입[] 변수명 = new 데이터타입[인덱스수];
			 ex) int[] scores = new int[5];
		
	4. 배열의 제약사항
		1) 배열의 크기(길이)는 한번 정의되면 변경 불가. 즉, 고정됨
		2) 동일타입의 데이터만 저장가능.
		3) 배열의 선언은 대괄호[]로 선언.
		4) 배열의 접근은 index로 접근.
		5) index는 0부터 시작.
*/

public class arrayMain1 {

	public static void main(String[] args) {
		
		// 1. 배열의 초기화 및 생성
		int[] scores = {90, 95, 88, 90, 89, 100, 99, 78, 66, 65, 88, 99};
		
		// 	1) 힙영역의 메모리주소
		System.out.println(scores);				// 메모리주소 : 16진수
		System.out.println(scores.hashCode());	// 메모리주소 : 10진수
		System.out.println(scores.toString());	// 메모리주소 : 문자열(16진수)
		System.out.println();
		
		// 	2) index : 접근방법
		System.out.println(scores[0]);
		System.out.println(scores[1]);
//		System.out.println(scores[-1]);	//Error: 음수는 허용불가
		System.out.println();
		
		// 	3) length
		System.out.println("배열의 크기 = " + scores.length);
		System.out.println(scores[scores.length-1]);	//마지막 요소에 접근
		System.out.println();
//		scores.length = 10;	//Error: 배열의 크기 length속성은 읽기전용.
		
		// 	4) for문과 array
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] = " +  scores[i]);
			sum += scores[i];
		}
		System.out.println("배열요소의 합계 = " + sum);
		System.out.println("배열요소의 평균 = " + (sum/scores.length) + "\n");
		
		
		sum = 0;
		for(int score : scores) {
			sum += score;
		}
		System.out.println("배열요소의 합계 = " + sum);
		System.out.println("배열요소의 평균 = " + (sum/scores.length) + "\n");
	}

}
