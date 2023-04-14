package com.lec.exercise.answer;

public class Account {
	
	private int balance = 0;
	private final int MIN_BALANCE = 0;
	private final int MAX_BALANCE = 1000000;
	
	
	
	
	public void setBalance(int balance) {
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
			System.out.println("balance를 수정할 수 없습니다");
		} else {
			this.balance = balance;
		}
	}

	
	
	public int getBalance() {
		return balance;
	}

	
	
	
	
}
