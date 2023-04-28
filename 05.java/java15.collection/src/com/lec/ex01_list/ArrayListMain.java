package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.List;

/*
	컬렉션프레임워크(Collection Framework)
	
	애플리케이션을 개발하면 다수의 객체를 저장해서 필요할 때마다 꺼내서 사용하는 경우가 많다.
	이러한 객체를 효율적으로 추가, 삭제, 검색할 경우 가장 간단한 방법은 배열을 이용하는 것이다.
	배열은 쉽게 생성하고 사용할 수 있지만 저장객체의 크기가 배열생성시에 고정되므로 불특정 다수의
	객체를 저장하거나 관리하기엔 문제가 많다
	
	자바는 배열의 이러한 문제점을 해결하게 위해 자료구조(Data Structure)를 바탕으로 객체를 효율적으로
	추가, 삭제, 검색할 수 있도록 java.util패키지에 컬렉션과 관련된 인터페이스와 구현클래스를 포함시켰다.
	이들을 총칭해서 컬렉션프레임워크라고 한다.
	
	컬렉션프레임워크에는 몇가지 인터페이스를 통해서 다양한 컬렉션을 이용할 수 있도록 하고있다.
	주요 인터페이스로는 List, Set, Map이 있다.
	
	0. 인터페이스의 분류
		1) Collection계열
			a. List : 순서가 있다. 중복저장가능, index로 접근(ArrayList, Vector, LinkedList)
			b. Set  : 순서가 없다. 중복저장불가, 반복자(Iterator)로 접근(HashSet, TreeSet)
			
		2) Map계열
			- Key와Value를 한쌍(EntrySet)으로 저장, Key는 중복불가, Value는 중복저장가능
			- 구현클래스 : HashMap, HashTable, TreeMap, Properties
	
	
	
	1. List Collection
		객체를 일렬로 늘여놓은 구조. 객체를 인덱스로 관리하므로 객체를 저장하면 자동으로 인덱스가 부여된다.
		이 인덱스로 객체를 검색, 삭제할 수 있는 기능을 제공한다. 동일한 객체를 중복저장할 수 있는데, 이 경우
		동일한 객체를 참조하는 주소가 저장된다.
		null도 저장가능. 이 경우엔 해당인덱스엔 참조하는 객체가 없으므로 검색하면 NullPointException예외가 발생한다.
	
		1) ArrayList
			List인터페이스의 구현클래스. ArrayList에 객체를 추가하면 객체가 인덱스로 관리된다.
			일반 배열과 ArrayList는 인덱스로 객체를 관리한다는 점에선 유사하나, 큰 차이점이 있다.
			일반배열은 생성시에 크기가 고정되고 사용중엔 크기변경이 불가하지만
			ArrayList는 저장용량이 초과될 경우 객체가 추가되면 자동으로 저장용량(크기)이 증가한다.
			
			ArrayList는 객체의 크기를 저장하지 않고 생성하면 10개의 기본크기를 가진다. 처음부터 객체의 크기를
			저장할 경우엔 ArrayList<참조타입>(n)의 형태로 크기를 지정한다.
			
		2) Vector
			ArrayList와 동일한 내부구조를 가지고 있다.
			Vector를 생성하기 위해선 저장할 객체타입을 타입파라미터로 표기하고 기본생성자를 호출하면 된다.
			
			ArrayList와 다른점은 Vector는 동기화(Synchronized)메서드로 구성되어 있기때문에 멀티쓰레드 환경에서
			안전하다. 즉, 다른 쓰레드가 동시에 Vector에 접근할 수 없고 하나의 쓰레드 작업이 완료되어야
			다른 쓰레드가 실행할 수 있게 된다. 따라서 멀티쓰레드 환경에서 안전하게 객체를 추가/삭제할 수 있다.
			
		3) LinkedList
			List인터페이스의 구현클래스. ArrayList와 사용방법은 동일하지만 내부구조는 상이하다.
			ArrayList는 내부 배열에 객체를 저장해서 인덱스로 관리하지만
			LinkedList는 인접자료의 주소를 링크해서 체인연결처럼 관리한다.
			
			LinkedList에서 특정 인덱스에 위치한 객체를 제거하면 전후의 링크만 변경되고 나머지 링크는 변경되지 않는다.
			특정 인덱스에 객체를 삽입할 경우도 동일하게 적용된다.
			
			LinkedList를 생성하기 위해선 저장할 객체타입을 타입파라미터<E>로 표기하고 기본생성자를 호출한다.
			LinkedList는 처음 생성될때 어떠한 링크도 만들어지지 않으므로 내부는 비어있는다
	
 */

public class ArrayListMain {

	public static void main(String[] args) {
		
		// 1. ArrayList - non generic
		// 1) add
		List list = new ArrayList();	//크기는 기본값인 10
		list.add("문자열");
		list.add(new String("손흥민"));
		list.add(100);					// 자동Boxing Integer.valueOf(100)
		list.add(Integer.valueOf(100));
		list.add(new Car());
		list.add(new Apple());
		list.add(new Hammer());
		
		// 2) get
		String val0 = (String) list.get(0);
		String val1 = (String) list.get(1);
		Integer val2 = (Integer) list.get(2);
		Integer val3 = (Integer) list.get(3);
		Car val4 = (Car) list.get(4);
		Apple val5 = (Apple) list.get(5);
		Hammer val6 = (Hammer) list.get(6);
		
		System.out.println(val0);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		System.out.println(val5);
		System.out.println(val6);
		System.out.println();
		
		
		
		// 2. ArrayList - generic
		// 1) add
		List<String> list1 = new ArrayList<>();
//		list1.add(100);	(x)
//		list1.add(new Car()); (x)
		list1.add("Java");
		list1.add("JDBC");
		list1.add("JSP");
		list1.add("Servlet");
		list1.add("SpringFrameWork");
		list1.add("Python");
		list1.add("R");
		list1.add("C#");
		
		// 2) get - generic으로 String으로 제한을 걸었으므로 형변환 필요x
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println("JSP = " + list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		System.out.println(list1.get(5));
		System.out.println(list1.get(6));
		System.out.println(list1.get(7));
		System.out.println();
		
		// 3) 삽입 - add(index, 값)
		list1.add(2, "JavaScript");
		for(int i=0;i<list1.size();i++) {
			System.out.println("list1[" + i + "] = " + list1.get(i));
		}
		System.out.println();
		
		// 4) 삭제 - remove(index)
		list1.remove(3);
		for(String lst:list1) {
			System.out.println(lst);
		}
		System.out.println();
		
		// 5) 중복확인
		list1.add(3, "JEBC");
		for(String lst:list1) {
			System.out.println(lst);
		}
		System.out.println();
		
		// 6) 전체삭제
		list1.clear();
		System.out.println("list1의 갯수 = " + list1.size());
	}

}

class Apple{}
class Hammer {}
class Car {}