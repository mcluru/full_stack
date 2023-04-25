package com.codechobo.book;

public class Ex7_9_My {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();

	}

}

class Product2 {
	int price;		//제품가격
	int bonusPoint; //제품구매시 제공하는 보너스점수
	
	public Product2() {}	//기본생성자
	
	public Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product2 {
	public Tv2() { super(100); }
	
	@Override
	public String toString() { return "Tv";}
}

class Computer2 extends Product2 {
	public Computer2() {super(100);}
	
	@Override
	public String toString() {return "Computer";}
}

class Audio2 extends Product2 {
	public Audio2() {super(100);}
	
	@Override
	public String toString() {return "Audio";}
}


class Buyer2 {
	int money = 1000;					//소지한돈
	int bonusPoint;						//소지한포인트
	Product2[] cart = new Product2[10]; //장바구니
	int i = 0;							//장바구니 배열에 사용될 카운터
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+"를 구입했습니다");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i]+", ";
		}
		
		System.out.println("구입 총금액은" + sum + "만원입니다");
		System.out.println("구입하신 제품은" + itemList + "입니다");
	}
}



