package com.lec.ex4_tree.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain2 {

	public static void main(String[] args) {
		
		// 1. TreeMap값 가져오기
		TreeMap<Integer, String> students = new TreeMap<>();
		students.put(87, "홍길동");
		students.put(98, "손흥민");
		students.put(75, "이강인");
		students.put(95, "김민재");
		students.put(80, "소향");
		
		// 2. TreeMap 정렬하기
		// 1) 자동정렬
		System.out.print("오름차순 : ");
		for(Map.Entry<Integer, String> student:students.entrySet()) {
			int score = student.getKey();
		    String name = student.getValue();
		    System.out.print(name + " " + score + "점, ");
		}
		System.out.println();
		
		// 2) 내림차순
		// descendingMap(), descendingEnterMap()
		NavigableMap<Integer, String> descMap = students.descendingMap();
		System.out.print("내림차순 : ");
		Set<Map.Entry<Integer, String>> desEntry = descMap.entrySet();
		for(Map.Entry<Integer, String> student:desEntry) {
//		for(Map.Entry<Integer, String> student:descMap.entrySet()) {
			int score = student.getKey();
		    String name = student.getValue();
		    System.out.print(name + " " + score + "점, ");
		}
		System.out.println();
		
		// 내림차순 -> 오름차순
		NavigableMap<Integer, String> ascMap = descMap.descendingMap();
		System.out.print("내림->오름차순 : ");
		for(Map.Entry<Integer, String> student:ascMap.entrySet()) {
			int score = student.getKey();
		    String name = student.getValue();
		    System.out.print(name + " " + score + "점, ");
		}
		
	}

}
