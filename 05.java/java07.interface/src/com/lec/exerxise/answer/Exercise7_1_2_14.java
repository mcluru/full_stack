package com.lec.exerxise.answer;

public class Exercise7_1_2_14 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}


class SutdaDeck {
	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		// 배열 SutdaCard를 적절히 초기화하시오
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10) && (num==1||num==3||num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}

	
	void shuffle() {
		for(int i=0;i<100;i++) {
			SutdaCard bowl = cards[0];
			int num = (int)(Math.random()*20);
			
			cards[0] = cards[num];
			cards[num] = bowl;
		}
	}
	
	SutdaCard pick(int index) {
		SutdaCard mycard = cards[index];
		return mycard;
	}
	
	SutdaCard pick() {
		int num = (int)(Math.random()*20);
		SutdaCard mycard = cards[num];
		return mycard;
	}
	
}



class SutdaCard {
	// 멤버변수
	final int NUM;
	final boolean IS_KWANG;
	
	// 기본-this()생성자
	SutdaCard() {
		this(1, true);
	}
	//매개변수 생성자
	SutdaCard(int num, boolean isKwang) {
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	
	// info{}대신 Object클래스의 toString()을 오버라이딩했다
	public String toString() {
		return NUM + (IS_KWANG ? "K" : "");
	}
	
}