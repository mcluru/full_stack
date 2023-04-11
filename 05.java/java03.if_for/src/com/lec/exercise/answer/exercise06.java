package com.lec.exercise.answer;

public class exercise06 {

	public static void main(String[] args) {
//		6. Exercise06.java : 
//		    for문을 이용해서 삼각형을 출력하는 코드를 작성
//		    1)
//		    *
//		    **
//		    ***
//		    ****
//		    *****
		System.out.println("--------(1)");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//			2)
//		    *****
//		    ****
//		    ***
//		    **
//		    *
		System.out.println("--------(2)");
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		    3)
//		        *
//		       **
//		      ***
//		     ****
//		    *****
		System.out.println("--------(3)");
		for(int i=1; i<=5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		    4) 
//		    *****
//		     ****
//		      ***
//		       **
//		        *
		System.out.println("--------(4)");
		for(int i=1; i<=5; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=6; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		    5)	
//		       *
//		      ***
//		     *****
//		    *******
		System.out.println("--------(5)");
		for(int i=1; i<=4; i++) {
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		    6)
//		    *******
//		     *****
//		      ***
//		       *
		System.out.println("--------(6)");
		for(int i=4; i>=1; i--) {
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		    7)
//		       *
//		      ***
//		     *****
//		    *******      
//		     *****
//		      ***
//		       *  
		System.out.println("--------(6)");
		for(int i=1; i<=4; i++) {
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3; i>=1; i--) {
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}

}
