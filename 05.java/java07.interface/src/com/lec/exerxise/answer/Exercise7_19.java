package com.lec.exerxise.answer;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();
		
	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];	//구입한 제품을 저장하기 위한 배열
	int i = 0;							//Product배열 cart에 사용될 index
	
	void buy(Product p) {
		//가진 돈과 물건의 가격을 비교해서 하진돈이 적으면 메서드를 종료
		if(money<p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			return;
		}
		//가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
		money -= p.price;
		// 장바구니에 구입한 물건을 담는다(add 메서드 호출)
		add(p);
	}
	
	void add(Product p) {
		//i의 값이 장바구니의 크기보다 같거나 크면
		//기존의 장바구니보다 2배 큰 새로운 배열을 생성한다
		//기존의 장바구니의 내용을 새로운 배열에 복사한다
		//새로운 장바구니와 기존의 장바구니를 바꾼다
		if(i>=cart.length) {
			Product[] old_cart = cart;
			cart = new Product[old_cart.length*2];
			for(int i=0;i<old_cart.length;i++) {
				cart[i] = old_cart[i];
			}
		}
		
		//물건을 장바구니에 저장한다. 그리고 i의 값을 1 증가시킨다
		cart[i++] = p;
	}
	
	void summary() {
		//장바구니에 담긴 물건들의 목록을 만들어 출력한다
		System.out.print("구입한 물건:");
		for(Product mycart:cart) {
			System.out.print(mycart + ",");
		}
		System.out.println();
		//장바구니에 담긴 물건들의 가격을 모두 더해 출력한다
		int sum = 0;
		for(Product mycart:cart) {
			sum += mycart.price;
		}
		System.out.println("사용한 금액:" + sum);
		//물건을 사고 남은 금액(money)를 출력
		System.out.println("남은 금액:" + money);
	}
}



class Product {
	int price;		//제품의 가격
	
	Product(int price) {	//매개변수있는 생성자
		this.price = price;
	}
}

class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio"; }
}