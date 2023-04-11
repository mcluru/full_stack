package com.lec.ex04_while;

import javax.swing.JOptionPane;

public class swingMain {

	public static void main(String[] args) {
		
		// 숫자 맞추기 게임
		// Java에서 swing은 GUI환경으로 인터페이스를 만들어줌
		String data = JOptionPane.showInputDialog("숫자를 입력하세요");
//		System.out.println("입력된 값 = " + data);
		
		int answer = 77;
		int inputNumber = 0;
		inputNumber = Integer.parseInt(data);
		
		if(inputNumber == answer) {
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
		
		System.out.println(JOptionPane.showConfirmDialog(null, data));	//Yes=0, No=1, cancle=2
//		JOptionPane.showConfirmDialog(null, data);
		
	}

}
