package com.lec.ex01_interface;

/*
	인터페이스(interface)
	
	Java에서 인터페이스는 객체의 사용방법을 정의한 설계. interface도 참조타입임
	인터페이스는 객체의 교환성(형변환)을 높여주므로 다형성을 구현하는 매우 중요한 역할수행함.
	특히, Java8버전부터 인터페이스의 중요성은 커짐.
	Java의 람다식은 함수적인터페이스(Functional Interface)의 구현객체를 생성하기 때문
	
	인터페이스는 개발코드와 객체가 서로 통신하는 접점역할을함. 개발코드가 인터페이스의
	메서드를 호출하면 인터페이스는 객체의 메서드를 호출함. 때문에 개발코드는 객체의 내부구조를
	알 필요 없고 인터페이스의 메서드만 알고있으면 됨.
	
	개발코드가 직접 메서드를 호출하면 간단하지만 중간에 인터페이스를 두는 이유는
	개발코드를 직접 수정하지 않고 사용하는 객체만 변경할 수 있도록 하기 위해서다.
	
	인터페이스는 하나의 객체가 아니라 여러객체들과 사용이 가능하므로 어떤 객체를 사용하느냐에
	따라 실행내용과 결과값이 다를 수 있어, 개발코드 측면에서 보면 코드의 변경 없이
	실행내용과 리턴값을 다양화할 수 있다는 장점이 있다.
	
*/

public interface RemoteControl {
	
	// 1. 상수필드(static final, constant field)
	//		인터페이스는 객체의 사용설명서 역할을 하므로 런타임시 데이터를 저장할 수 있는
	//		필드를 선언할 수 없음. 하지만 상수필드는 선언 가능. 상수는 인터페이스에 고정된
	//		값으로 런타임시 변경할 수 없기 때문에 상수 선언할땐 반드시 초기화 즉 초기값 대입 필수
	//		인터페이스에서 필드는 상수로 선언되므로 별도로 명시하지 않아도 컴파일시 자동으로
	//		public static final이 추가된다
	int min_volumn = 0;
	public static final int MAX_VOLUMN = 100;
	
	
	
	// 2. 추상메서드
	//		추상메서드는 객체가 가지고있는 메서드를 설명하는 것으로 호출할 때 어떤 매개값이
	//		필요한지, 어떤 리턴값이 무엇인지를 정의함. 실제 실행부는 객체(구현객체or실제객체)가
	//		가지고 있음. 인터페이스의 메서드는 무조건 추상메서드이므로 public abstract가 생략되어도
	//		컴파일시 자동으로 추가됨
	void powerOn();
	void powerOff();
//	void setVolumn(int volumn);
	public abstract void setVolumn(int volumn);
	
	
	
	// 3. default 메서드(객체(인스턴스)멤버)
	//		default메서드는 인터페이스에서 선언되지만 사실 구현객체가 가지고있는 인터페이스
	//		메서드라고 생각하면됨. java8에서 default메서드를 허용한 이유는 기본 인터페이스를
	//		확장해서 새로운 기능을 추가하기 위해서다.
	//		default메서드는 실행블럭을 가지고 있는 메서드로서 default키워드를 반드시 붙여야함
	default void neflex() {
		System.out.println("넷플릭스채널을 시청합니다");
	};
	
	//		기본적으로 public 접근제한자를 가지고 있으므로 생략하더라고 컬파일시 자동으로 추가됨
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거");
		} else {
			System.out.println("음소거해제");
		}
	}
	
	
	
	// 4. static 메서드(인터페이스멤버)
	// 		정적메서드도 java8부터 사용할 수 있는데 디폴트메서드와 달리 객체가 생성되지 않아도
	// 		사용할 수있는 메서드다. 즉, 객체멤버가 아닌 인터페이스멤버로서 인터페이스명으로
	//		호출할 수 있는 메서드.
	static void changeBttery() {;
		System.out.println("건전지 교체");
	}
}






class SmartTBRemocontrol implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("파워온");		
	}

	@Override
	public void powerOff() {
		System.out.println("파워오프");
	}

	@Override	//default메서드도 재정의가능
	public void setVolumn(int volumn) {
		RemoteControl.changeBttery();	// 객체생성없이 인터페이스명으로만 호출
	}
	
	
}