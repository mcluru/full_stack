package com.lec.exerxise.answer;

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.println(deck.cards[i] + ", ");
		}
	}

}


class SutdaDeck {
	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		// 배열 SutdaCard를 적절히 초기화하시오
		for(int i=0; i<cards.length; i++) {
			if((i+1)==1 || (i+1)==3 || (i+1)==8) {
				cards[i] = new SutdaCard(i%10+1, true);
			} else {
				cards[i] = new SutdaCard();
			}
		}
	}

}



class SutdaCard {
	// 멤버변수
	int num;
	boolean isKwang;
	
	// 기본-this()생성자
	SutdaCard() {
		this(1, true);
	}
	//매개변수 생성자
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info{}대신 Object클래스의 toString()을 오버라이딩했다
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
}