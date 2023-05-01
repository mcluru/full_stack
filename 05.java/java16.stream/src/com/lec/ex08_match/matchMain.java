package com.lec.ex08_match;

import java.util.Arrays;

/*
	매칭(allMatch(), anyMatch(), noneMatch())
	
	스트림클래스는 최종처리단계에서 요소들이 특정조건에 맞는지 조사할 수 있도록
	세가지 매칭메서드를 제공한다
	
	1. allMatch() : 모든 요소들이 매개값으로 주어진 조건에 만족하는지 여부를 리턴
	2. anyMatch() : 최소 한개의 요소가 주어진 조건에 만족하는지 여부를 리턴
	3. noneMatch() : 모든 요소들이 주어진 조건에 만족하지 않는지 여부를 리턴
 */

public class matchMain {

	public static void main(String[] args) {
		
		int[] int_arr = {2,4,6};
		
		// 1. allMatch()
		boolean result = Arrays.stream(int_arr).allMatch(n -> n%2==0);
		System.out.println("스트림요소 전체가 2의 배수인가? " + result);
		result = Arrays.stream(int_arr).allMatch(n -> n%3==0);
		System.out.println("스트림요소 전체가 3의 배수인가? " + result);
		System.out.println();
		
		
		// 2. anyMatch()
		result = Arrays.stream(int_arr).anyMatch(n -> n%3==0);
		System.out.println("스트림요소 중 하나라도 3의 배수인가? " + result);
		System.out.println();

		
		// 3. nonMatch()
		result = Arrays.stream(int_arr).noneMatch(n -> n%3==0);
		System.out.println("스트림요소 중 3의 배수가 없는가? " + result);
		
		
		
	}

}
