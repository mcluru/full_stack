package com.lec.ex01_intro;

import java.util.Arrays;
import java.util.List;

public class MapAndReducemain {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
					new Student("홍길동", 95),
					new Student("홍길순", 91),
					new Student("홍길자", 98),
					new Student("홍길상", 92)
				);
		
		// stream의 중간처리와 최종처리
		// 1. 학생들의 평균은?
		//	  중간처리 mapToInt() -> 최종처리 average() -> 결과값을 리턴 getAsDouble()
		double avg = list.stream()
						 .mapToInt(s -> s.getScore())
						 .average()
						 .getAsDouble();
		System.out.println("학생들의 평균점수 = " + avg);
		
		// lambda식의 다른 표현방식
		avg = list.stream()
				  .mapToInt(Student :: getScore)
				  .average()
				  .getAsDouble();
		System.out.println("학생들의 평균점수 = " + avg);
		
		
		// 2. 학생들의 총점은?
		// 	  중간처리 mapToInt() -> sum()
		int sum = list.stream()
				      .mapToInt(s -> s.getScore())
				      .sum();
		System.out.println("학생들의 총점 = " + sum);
		
		sum = list.stream()
				  .mapToInt(Student :: getScore)
			 	  .sum();
		System.out.println("학생들의 총점 = " + sum);
		
		
		// 3. 학생인원
		//	  중간처리 MapToInt(0 -> count()
		long count = list.stream()
			       		.mapToInt(Student :: getScore)
			       		.count();
		System.out.println("학생 인원 = " + count);
		
	}

}
