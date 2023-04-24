package com.lec.ex05_string.builder;

/*
	StringBuilder, StringBuffer
	
	문자열을 저장하는 String클래스는 내부의 문자열을 직접 수정 불가하다.
	예를들어 String.relace()메서드는 내부의 문자열 변경이 아닌 새롭게 대체된 문자열객체를 리턴.
	또한 "JAVA" + "PROGRAMMING"을 실행한 경우 내부문자열 수정 불가하므로, "JAVA PROGRAMMING"이란
	새로운 String객체를 생성한 후 그 객체의 참조주소를 리턴한다. "+"연산자로 문자열을 결합할 경우
	그 수만큼 새로운 String객체의 수가 증가하므로 프로그램 성능저하의 원인이 된다.
	
	따라서 문자열을 변경하는 작업이 많을 경우 String클래스보다 java.lang의 StringBuffer, StringVuilder클래스
	사용을 권장한다. 두 클래스는 내부버퍼(buffer, 데이터를 임시로 저장하는 메모리)에 문자열을 저장해 두고
	그 안에서 수정,추가,삭제 등의 작업이 가능하게 한다
	String처럼 새로운 객체생성 없이 문자열 조작할 수 있다는 장점이 있다
	
	StringBuffer와 StringBuilder의 사용법은 동일하다. 차이점이라면
	StringBuffer는 멀티쓰레드환경에서 사용할 수 있게 동기화가 적용되어있는 쓰레드(Thread)에 안전하지만
	StringBuilder는 안전하지 않아 단일 쓰레드환경에서만 사용하도록 설계되어있다
	
	
	StringBuffer / StringBuilder 제공메서드
	
	1. append		: 문자열 끝에 주어진 문자열을 추가
	2. insert		: 문자열 사이에 주어진 문자열을 삽입
	3. delete		: 매개값으로 주어진 문자열을 삭제
	4. deleteCharAt	: 주어진위치(index)의 문자를 삭제
	5. replace		: 다른 문자열로 변경
	6. reverse		: 문자열을 반대로 뒤집기
	7. setCharAt	: 주어진 위치의 문자열을 매개변수로 전달해 문자열로 대체
	
	StringBuilder(int capacity) 생성자는 capacity로 주어진 수만큼 문자를 저장할 수 있는 초기 buffer를 생성한다.
	StringBuilder는 버퍼가 부족할 경우 자동으로 버퍼크기만큼 증가시켜주므로 초기버퍼의 크기는 중요하지 않다
*/

public class StringBufferMain {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 1. append
		sb.append("JAVA " );
		System.out.println(sb.hashCode() + ", " + sb);
		sb.append("PROGRAMING" );
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 2. insert
		sb.insert(4, "홍길동");
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 3. delete
		sb.delete(4, 5);
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 4. deleteCharAt
		sb.deleteCharAt(4);
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 5. replace
		sb.replace(4, 6, "이강인");
		System.out.println(sb.hashCode() + ", " + sb);

		// 6. reverse
		sb.reverse();
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 7. setCharAt
		sb.setCharAt(6, 'X');
		System.out.println(sb.hashCode() + ", " + sb);
		
		// 8. length
		System.out.println(sb.hashCode() + ", " + sb.reverse() + ", 문자열의 총길이 = " + sb.length());
		
		// 9. toString() - StringBuilder를 String으로 변환
		String result = sb.toString();
		System.out.println(result.hashCode() + ", " + result + ", " + result.getClass());
		
		// 10. String -> StringBuffer참조타입으로 변환
		StringBuffer sb1 = new StringBuffer(result);
		System.out.println(sb1.hashCode() + ", " + sb1 + ", " + sb1.getClass());
		
		
	}

}
