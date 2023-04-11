package com.lec.ex03_for;

public class forFloatMain {

	public static void main(String[] args) {
		
		// for문을 사용할 때 초기화식에서 루프 카운트변수를 선언할 때
		// 부동소수점타입(실수)은 사용하지 않아야함.
		
		for(float f=0.1f ; f<=1.0f ; f+=0.1f) {
			System.out.println(f);
		}
		
		// 위 결과는 9번만 실행됨. 0.1dms float타입으로 정확하게 계산할 수 없기 때문에, 실제값은 0.1보다 약간 큰 값으로 처리됨.
		
		
	}

}
