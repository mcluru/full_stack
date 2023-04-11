package com.lec.exercise.answer;

import java.util.Scanner;

public class exercise07 {

	public static void main(String[] args) {
//		 7. Exercise07.java : 
//			 while문과 Scanner를 이용해서 키보드로 부터 입력된 데이터로 예금, 출금, 조회, 종료기능을
//			 제공하는 코드를 작성(예금잔액을 입출금내역을 출력)
//			 WhileKeyControlMain.java를 참조해서 자유롭게 작성
//				System.out.println("-------------------------------------");
//				System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
//				System.out.println("-------------------------------------");
//				
//				JOptionPan.showInputDialog() 이용해도 상관없음
		
		Scanner sc = new Scanner(System.in);
		int num = 1991060;
		String pw = "1234";
		int count = 0;
		
		while(true) {
			System.out.println("-------------------------------------");
			System.out.println("이용할 서비스를 선택해주세요");
			System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
			System.out.println("-------------------------------------");
			int myinput = sc.nextInt();
			if(myinput == 4) {
				break;
			} else if (myinput == 1) {
				System.out.println("예금을 선택하셨습니다");
				System.out.println("넣으실 금액을 입력해주세요");
				int myyea = sc.nextInt();
				System.out.println("넣으실 금액은" + myyea + "원 입니다. 예금 완료하시겠습니까?");
				System.out.println("1. 예 | 2. 아니오");
				int myoption = sc.nextInt();
				if(myoption == 1) {
					num += myyea;
					System.out.println("예금이 완료되었습니다");
					System.out.println("잔액은 " + num + "원 입니다");
					System.out.println();
				} else {
					System.out.println("취소되었습니다. 메인화면으로 돌아갑니다");
					System.out.println();
				}
			} else if (myinput == 2) {
				System.out.println("출금을 선택하셨습니다");
				myAtm: while(true) {
					if(count >= 5) {
						System.out.println("비밀번호를 5회 잘못 입력했습니다");
						System.out.println("메인화면으로 돌아갑니다");
						count = 0;
						break myAtm;
					}
					System.out.println("비밀번호를 입력해주세요");
					String mypw = sc.next();
					if(mypw.equals(pw)) {
						
						while(true) {
							System.out.println("출금할 금액을 입력해주세요");
							int mychul = sc.nextInt();
							if(mychul <= num) {
								num -= mychul;
								System.out.println(mychul + "원 출금 완료되었습니다");
								System.out.println("잔액은 " + num + "원 입니다");
								break myAtm;
							} else {
								System.out.println("잔액이 부족합니다");
								System.out.println("계속하시겠습니까?");
								System.out.println("1. 예 | 2. 아니오");
								int myoption2 = sc.nextInt();
								if(myoption2 == 1) {
									continue;
								} else {
									System.out.println("메인화면으로 돌아갑니다");
									break myAtm;
								}
							}
						}

					} else {
					System.out.println("잘못 입력했습니다");
					count ++;
					continue;
					}
				}
				
			} else if (myinput == 3) {
				System.out.println("조회를 선택하셨습니다");
				System.out.println();
				System.out.println("카드 잔액을 확인해주세요.");
				System.out.println("잔액 : " + num + "원");
				System.out.println();
			}
			
			
		}
		System.out.println("프로그램을 종료합니다");
		
		
	}

}
