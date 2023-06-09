package com.lec.ex03_map.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

/*
	Properties
	
	HashTable의 하위클래스이기 때문에 HashTable의 모든 속성을 그대로 가지고 있는데
	차이점은 HashTable은 키와 값에 다향한 참조타입으로 정의할 수 있지만
	Properties는 키와 값의 참조타입이 오직 String으로만 정의할수 있도록 제한된 Map컬렉션이다.
	
	Properties는 애플리케이션의 옵션정보, 데이터베이서의 연결정보, 국제화(다국어)정보가
	제공된 프로퍼티파일을 읽을 때 주로 사용한다.
	
	Properties파일은 키와 값이 "="로 연결되어 있는 텍스트파일로, ISO8859-1문자셋으로 저장된다.
	이 문자셋으로 직접 표현할 수 없는 값, 즉 한글은 유니코드(\u9999)로 변환되어 저장된다.
	
	이클립스에선 유니코드로 변환된 내용을 한글로 확인하려면 마우스를 유니코드위에 올려서 확인할 수 있다.
	
	이클립스를 사용하지 않는다면 한글이 포함된 Properties파일을 다른 에디터(ex:notepad)에서 작성하고
	JDK설치 폴더에 native2ascii.exe프로그램을 이용해 ISO8859-1파일로 저장한다
 */

public class PropertiesMain {

	public static void main(String[] args) throws IOException {
		
		// Properties파일 읽기
		// 1. 파일경로 확인
		String path = PropertiesMain.class.getResource("database.properties").getPath();
		//폴더명에 한글이 있을 경우 decoding, UnsupportedEncodingException예외처리
		path = URLDecoder.decode(path, "utf-8");
		System.out.println("파일경로 = " + path);
		
		// 2. 파일읽기
		Properties properties = new Properties();	//HashTable의 하위클래스
		properties.load(new FileReader(path));		//IOException, FileNotFoundException예외처리
		
		// 3. key와 value 읽기
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		String hangul = properties.getProperty("hangul");
		String mariadb = properties.getProperty("mariadb");
		String mysql = properties.getProperty("mysql");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		System.out.println(hangul);
		System.out.println(mariadb);
		System.out.println(mysql);
		
		
	}

}
