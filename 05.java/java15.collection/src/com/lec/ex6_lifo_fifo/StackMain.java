package com.lec.ex6_lifo_fifo;

import java.util.Stack;

/*
	LIFO(후입선출)와 FIFO(선입선출) 컬렉션
	
	후입선출(LIFO, Last In First Out) : 나중에 저장된 객체를 먼저 꺼내오는 자료구조
	선입선출(FIFO, First In First Out): 먼저 저장된 객체가 먼저 꺼내지는 자료구조
	
	컬렉션프레임워크엔 LIFO자료구조를 지원하는 Stack클래스와 FIFO자료구조를 지원하는
	Queue 인터페이스를 지원한다
	
	1. Stack class
		LIFO자료구조를 구현한 클래스다. 주요메서드는
		
		1) push(E item) : 주어진 객체를 stack에 저장
		2) peek()		: stack의 맨위(맨 나중에 저장된) 객체를 꺼내기만 한다
		3) pop()		: stack의 맨위(맨 나중에 저장된) 객체를 꺼낸 후 삭제
		
	2. Queue Inteface
		FIFO자료구조를 구현한 LinkedList이고 주요 메서드는
		
		1) offer(E item) : 주어진 객체를 interface에 저장
		2) peek()		 : 맨 처음에 저장된 객체를 꺼내기만 한다
		3) poll()		 : 맨 처음에 저장된 객체를 꺼낸 후 삭제
 */

public class StackMain {

	public static void main(String[] args) {
		
		Stack<Coin> coin_box = new Stack<>();
		
		coin_box.push(new Coin(50));
		coin_box.push(new Coin(100));
		coin_box.push(new Coin(10));
		coin_box.push(new Coin(1));
		coin_box.push(new Coin(500));
		
		while(!coin_box.isEmpty()) {
			Coin coin = coin_box.pop();
			System.out.println("꺼내온 동전은 " + coin.getValue() + "원 입니다");
		}
		System.out.println("프로그램 종료");
		
		
		
	}

}


class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}