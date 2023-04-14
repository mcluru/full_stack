package com.lec.ex16_package.mycompany;

import com.lec.ex16_package.hankook.SnowTire;
import com.lec.ex16_package.hyundai.Engine;
import com.lec.ex16_package.kumho.BigWidthTire;

/*
	패키지(package)
	프로그램 개발중에 객체는 수십개~수백개의 클래스를 작성해야함.
	클래스를 체계적으로 관리하지 않으면 클래스간의 관계가 뒤엉켜서
	복잡하고 난해한 프로그램이 되어 유지보수가 어려워짐.
	
	자바에선 클래스를 체계적으로 관리하기 위해 패키지를 사용함.
	PC에서 파일을 분류, 저장해서 파일을 그룹화로 관리하는 것처럼
	Java에선 패키지로 유사한 기능을 하는 클래스들끼리 그룹화해서
	저장, 관리함.
	
	패키지의 물리적인 형태는 파일시스템의 폴더임. 패키지는 단순히
	파일시스템의 폴더기능뿐 아닌 "클래스의 이름의 일부분".
	즉, 클래스이름은 패키지명을 포함한 클래스파일명 전체가 클래스이름임.
	
	패키지는 클래스를 유일하게 만들어주는 역할. 클래스파일이름이
	동일해도 패키지가 틀리면 다른 클래스로 인식함.
	
	클래스 전체이름은 "패키지명.하위패키지명.클래스명".
	상위,하위로 구분되어 있다면 dot(.)구분자로 구분됨.
	
	패키지의 선언은 자바의 명명규칙을 준수하는데, 패키지명은 전부
	소문자로 정의하는 게 관례.
*/

public class carMain {

	public static void main(String[] args) {
		
		
		Engine engine = new Engine();
		com.lec.ex16_package.hankook.Tire flt = new com.lec.ex16_package.hankook.Tire();
		com.lec.ex16_package.kumho.Tire blt = new com.lec.ex16_package.kumho.Tire();
		
		// 단축키 : ctrl+shift+O
		SnowTire frt = new SnowTire();
		BigWidthTire brt = new BigWidthTire();
		
		System.out.println("My Car 한대가 생산되었습니다");
		
		
		
	}

}
