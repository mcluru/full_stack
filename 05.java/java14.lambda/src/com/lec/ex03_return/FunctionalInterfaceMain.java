package com.lec.ex03_return;

public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		MyInterface fi = null;
		
		fi = new MyInterface() {
			
			@Override public int mymethod(int x, int y) { return x+y; }
		};
		System.out.println("fi.mymethod(10, 10) = "+fi.mymethod(10, 10));
		
		// 매개변수가 두개 이상일 경우 소괄호 생략 불가
		fi = (a, b) -> { return a + b; };
		System.out.println("fi.mymethod(20, 10) = "+fi.mymethod(20, 10));
		
		// return문이 있을 경우 실행문이 한개라도 중괄호 생략 불가
		// 대신 return문을 생략 가능
		fi = (a, b) -> a + b;
		System.out.println("fi.mymethod(30, 10) = "+fi.mymethod(30, 10));
		
		fi = (a, b) -> a - b;
		System.out.println("fi.mymethod(30, 10) = "+fi.mymethod(30, 10));
		
		fi = (a, b) -> a * b;
		System.out.println("fi.mymethod(30, 10) = "+fi.mymethod(30, 10));
		
		fi = (a, b) -> a / b;
		System.out.println("fi.mymethod(30, 10) = "+fi.mymethod(30, 10));
//		System.out.println("fi.mymethod(30, 0) = "+fi.mymethod(30, 0));	//Error. java.lang.ArithmeticException: / by zero
		
		// 람다식에 함수를 정의
		fi = (x, y) -> (int) div(10, 0);
		System.out.println("10/0 = " + fi.mymethod(10, 0));
		fi = (x, y) -> (int) div(10, 5);
		System.out.println("10/0 = " + fi.mymethod(10, 5));
				
		
	}

	private static double div(int i, int j) {
		if(j == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			return 0.0;
		}
		double result = i/j;
		return result;
	}

}


@FunctionalInterface
interface MyInterface {
	int mymethod(int x, int y);
}