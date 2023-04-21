package com.lec.ex01_object.ex04_clone.shallow;

/*
	객체의 복제(clone())
	
	객체복제는 원본객체의 필드값과 동일한 값을 가지는 새로운 객체생성을 의미.
	객체를 복제하는 이유는 원본객체를 안전하게 보호하기 위함
	
	신뢰하지 않는 영역으로 원본객체를 넘겨서 작업할 경우 원본객체의 데이터가
	훼손될 수 있으므로 복제된 객체를 만들어 신뢰하지 않는 영역으로 넘기는게
	복제된 객체의 데이터가 변경되더라도 원본객체는 아무런 영향을 받지 않으므로
	안전하게 데이터를 보호할 수 있다.
	
	Object.clone()메서드는 자신과 동일한 필드값을 가진 얕은 복제된 객체를 리턴함.
	clone()메서드로 객체를 복제하려면 원본객체는 java.lang.Cloneable 인터페이스
	구현이 필수다. 클래스설계자가 복제허용을 안한다면 Cloneable인터페이스를
	구현하지 않으면 됨.
	
	
	객체를 복제하는 방법은 2가지
	1. 얕은 복제(shallow clone)
		단순히 필드값을 복사해서 객체를 복제하는 것.
		필드값만 복제하므로 필드가 기본타입일 경우 값의 복사가 일어나고
		참조타입일 경우 객체의 메모리번지가 복사된다
		
		얕은 복제의 경우 참조필드는 메모리번지만 복제되므로 원본객체의 필드와
		복제객체의 필드는 같은 메모리주소를 참조한 동일 객체를 참조하게 됨.
		만약 복제객체에서 참조객체를 변경하면 원본객체도 변경된 객체를 참조하게 된다.
		이게 얕은복제의 문제점. 이 분제를 보완하기 위해 깊은 복제를 함
		
	2. 깊은 복제(deep clone)
		참조하고 있는 객체도 복제하는 것. 깊은 복제를 하려면 Object.clone메서드를
		재정의해서 참조객체를 복제하는 코드를 직접 작성해야함
*/

public class Member implements Cloneable {
	// implements Cloneable : 이 객체는 복제가능하다는 뜻
	
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int[] scores = {90,88,92};
	
	
	public Member(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) super.clone();	// 얕은복제
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	
	
	
}
