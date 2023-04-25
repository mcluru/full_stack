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
	int price;		//��ǰ����
	int bonusPoint; //��ǰ���Ž� �����ϴ� ���ʽ�����
	
	public Product2() {}	//�⺻������
	
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
	int money = 1000;					//�����ѵ�
	int bonusPoint;						//����������Ʈ
	Product2[] cart = new Product2[10]; //��ٱ���
	int i = 0;							//��ٱ��� �迭�� ���� ī����
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+"�� �����߽��ϴ�");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i]+", ";
		}
		
		System.out.println("���� �ѱݾ���" + sum + "�����Դϴ�");
		System.out.println("�����Ͻ� ��ǰ��" + itemList + "�Դϴ�");
	}
}



