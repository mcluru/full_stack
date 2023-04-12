package com.lec.exercise.answer;

public class exercise6 {

	public static void main(String[] args) {
//		6. Exercise07.java : 
//		   주어진 배열의 항목에서 최대값을 구하기.(for문을 이용)
//		   
//		   int[] array={1,5,3,8,2};
		
		int[] array={1,5,3,8,2};
		int maxnum = 0;
		
		for(int arr : array) {
			if(arr>maxnum) {
				maxnum = arr;
			}
		}
		System.out.println(maxnum);
		
		
	}

}
