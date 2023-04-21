package com.lec.ex01_object.ex05_finalize;

/*
	객체소멸자(finalize())
	
	참조하지 않는 배열이나 객체는 GC(Garbage Collector)가 힙영역에서 자동적으로
	소멸시킴. GC는 객체를 소멸하기 직전 마지막으로 객체의 소멸자(finalize)를
	실행시킨다. 소멸자는 Object.finalize()메서드를 말하는데, 기본적으로 실행할
	내용이 없다.(실행블럭에 아무것도 없다)
	
	만약 객체가 소멸되기 전 마지막으로 사용했던 자원(데이터베이스연결객체, 파일객체 등..)
	을 닫고싶거나 중요한 데이터를 저장할 경우 finalize()를 재정의할 수 있음.
	
	gc가 객체를 소멸시킬 때 무작위로 소멸시키므로 순차적인 작업이 불가해 유의해서 사용해야한다
*/

public class Counter {

	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행되었습니다");
	}
}
