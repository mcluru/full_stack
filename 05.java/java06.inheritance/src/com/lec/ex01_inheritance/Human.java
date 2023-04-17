package com.lec.ex01_inheritance;

public class Human {
	
	String name;
	String gender;
	int age;
	
	public Human() {
		super();
	}
	
	void speak() {
		System.out.println("말한다");
	}
	void eat() {
		System.out.println("먹는다");
	}
	void move() {
		System.out.println("움직인다");
	}
	
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	
	
}
