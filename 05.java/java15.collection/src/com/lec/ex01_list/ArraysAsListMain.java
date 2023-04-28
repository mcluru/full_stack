package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListMain {

	public static void main(String[] args) {
		
		// 일반배열의 초기화
		String[] names = {"홍길동", "홍길순", "홍길자", "홍길상", "손흥민", "이강인", "김민재"};
		
		// ArrayList엔 초기화기능이 없다.
		// 대신 Arrays.asList(값,...)메서드를 이용해서 초기화 가능.
		// ArrayList를 생성하고 Runtime시 필요에 따라 객체를 추가하는 방법이 일반적이지만
		// 고정된 객체로 구성된 List를 생성할 경우엔 Arrays.aslist()메서드 사용이 편리함.
		// 다만 Arrays.asList()로 생성된 ArrList객체는 더이상 크기변경이 불가하다
		
		List<String> list1 = new ArrayList<>(6);
		list1.add("추가가능");
		list1.remove(0);	//삭제가능
		System.out.println("list1의 갯수 = " + list1.size());
		
		// ArrayList생성자를 이용하는 대신 Arrays.asList()로 간편하게 생성가능
		// 다만, asList()로 생성된 List는 고정된 객체로 생성이 된다.
		List<String> list2 = Arrays.asList("홍길동", "홍길순", "홍길자", "홍길상", "손흥민", "이강인", "김민재");
//		list2.add("추가불가");	//UnsupportedOperationException 예외 발생
//		list2.remove(0);	//삭제불가, UnsupportedOperationException 예외 발생
		System.out.println("list2의 갯수 = " + list2.size());
		
		for(String name:list2) {
			System.out.print(name + ", ");
		}
		System.out.println();
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = 0;
		for(Integer num : numbers) {
			sum += num;
		}
		System.out.println("1~10까지 합 = " + sum);
		
		
		
	}

}
