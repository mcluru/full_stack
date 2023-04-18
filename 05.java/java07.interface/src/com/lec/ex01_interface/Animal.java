package com.lec.ex01_interface;

public interface Animal {
	
	String KIND = "동물";	//public static final String KIND = "동물"; 과 동일
	void sound();			//public abstract void sound(); 와 동일
	
	default void breath() {
		System.out.println("숨쉽니다");
	}
	
}
