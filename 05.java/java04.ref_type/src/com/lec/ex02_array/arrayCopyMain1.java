package com.lec.ex02_array;

public class arrayCopyMain1 {

	public static void main(String[] args) {
		
		// 배열의 복사
		// 1. 참조타입인 배열
		String[][] name = {{"거미", "나얼"}, {"소향", "손흥민", "이강인"}};
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				System.out.println("name[" + i + "][" + j + "]" + name[i][j]);
			}
		}
		System.out.println();
		
		
		// 2. 배열복사 - 얕은복사(shallow copy)
		// 원본을 복사해서 별도로 가진 게 아닌, 똑같은 위치를 참조하기 때문에 원본이든 복사한곳이든 수정하면 원본의 결과가 바뀜.
		// 비유하자며 이클립스 import할때 copy안하고 파일자체를 가져온 것과 같음.
		String[][] name2 = name;
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				System.out.println("name[" + i + "][" + j + "]" + name[i][j]);
			}
		}
		System.out.println("----------------------");
		
		name[0][0] = "박정현";
		name2[1][2] = "김민재";
		
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				System.out.println("name[" + i + "][" + j + "]" + name[i][j]);
			}
		}
		System.out.println();
		
		
		for(int i=0; i<name2.length; i++) {
			for(int j=0; j<name2[i].length; j++) {
				System.out.println("name[" + i + "][" + j + "]" + name2[i][j]);
			}
		}
		
		
		
		
	}

}
