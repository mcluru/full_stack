package com.lec.exercise.answer;

public class Exercise8_9 {

	public static void main(String[] args) {
		
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
		
	}

}

class UnsupportedFunctionException extends RuntimeException {
	
	private final int ERR_CODE = 100;	//에러코드 저장할 변수
	
	//생성자
	public UnsupportedFunctionException(String msg, int num) {
		super(msg);
	}
	
	
	//메서드
	public int getErrorCode() {		//에러코드(ERR_CODE)를 반환
		return ERR_CODE;
	}

	@Override
	public String getMessage() {	//메세지의 내용 반환. Exception클래스의 getMessage()를 오버라이딩
		return "[" + getErrorCode() + "]" + super.getMessage();
	}
	
	
	
	
	
}