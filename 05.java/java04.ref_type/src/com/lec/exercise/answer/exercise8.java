package com.lec.exercise.answer;

import java.util.Scanner;

public class exercise8 {

	public static void main(String[] args) {
//		8. Exercise09.java : 	
//		   키보드로부터 학생 수와 각 학생들의 점수를 입력받아서 최고 점수 및 평균 점수를 구하기
//		   (참고: Scanner의 nextlnt() 메소드이용)
//
//			System.out.println("---------------------------------------------");
//			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//			System.out.println("---------------------------------------------");
//			System.out.print("선택> ");	
//				
//			JOptionPan.showInputDialog() 이용해도 상관없음	
		
		Scanner sc = new Scanner(System.in);
//		1. 전역변수 ----------------------------------------------
		int stdnum = 0;		//학생수
		int[] scores = null;		//점수배열
		int maxscore = 0;
		int sumscore = 0;
		int avgscore = 0;
		
		while(true) {
			System.out.println("---------------------------------------------");
			System.out.println("이용할 서비스를 선택해주세요");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int opnum = sc.nextInt();
			System.out.println();
			
			if(opnum == 1) {
				System.out.println("학생수를 입력해주세요");
				stdnum = sc.nextInt();
				System.out.println("입력하신 학생은 " + stdnum + "명입니다.");
				scores = new int[stdnum];
				maxscore = 0;
				sumscore = 0;
				System.out.println();
			}
			if(opnum == 2) {
				if(stdnum == 0) {
					System.out.println("학생수를 먼저 입력해주세요");
					continue;
				}
				System.out.println("순차적으로 점수를 입력해주세요");
				for(int i=0; i<scores.length; i++) {
					scores[i] = sc.nextInt();
				}
			}
			if(opnum == 3) {
				if(stdnum==0) {
					System.out.println("학생수와 점수입력을 확인해주세요");
				}
				System.out.println("----------------");
				System.out.println("  번호  |  점수");
				for(int i=0; i<scores.length; i++) {
					System.out.println(i+1 + "번학생 |  " + scores[i] + "점");
				}
				System.out.println("----------------");
			}
			if(opnum == 4) {
				if(scores == null || scores[0]==0) {
					System.out.println("점수입력 후 선택해주세요");
					continue;
				}
				maxscore = 0;
				sumscore = 0;
				for(int arr : scores) {
					if(maxscore < arr) {
						maxscore = arr;
					}
					sumscore += arr;
				}
				avgscore = sumscore/scores.length;
				System.out.println("최고점수는 " + maxscore + "점 입니다");
				System.out.println("평균점수는 " + avgscore + "점 입니다");
				
			}
			if(opnum == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		
		
//		최고 점수 및 평균 점수
		
		
		
	}

}
