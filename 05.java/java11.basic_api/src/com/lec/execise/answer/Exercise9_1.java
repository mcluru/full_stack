package com.lec.execise.answer;

public class Exercise9_1 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2):"+c1.equals(c2));
		
	}

}


class SutdaCard {
	int num;
	boolean inKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.inKwang = isKwang;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return this.num == c.num && inKwang == c.inKwang;
		} else return false;
	}
	
	public String toString() {
		return num + (inKwang ? "K" : "");
	}
	
}