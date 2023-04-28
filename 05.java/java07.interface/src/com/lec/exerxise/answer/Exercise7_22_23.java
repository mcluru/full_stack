package com.lec.exerxise.answer;

public class Exercise7_22_23 {

	//sumArea메서드
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for(Shape myarr:arr) {
			sum+=myarr.calcArea();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
		
	}

}

// 추상클래스 Shape
abstract class Shape {
	//멤버변수
	Point p;
	
	//생성자
	Shape() {					//기본생성자
		this(new Point(0,0));
	}		
	Shape(Point p) {			//매개변수있는 생성자
		this.p = p;
	}
	
	//메서드
	abstract double calcArea();	//추상메서드. 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {		//멤버변수 p Getter메서드
		return p;
	}
	
	void setPosition(Point p) { //멤버변수 p Setter메서드
		this.p = p;
	}
}


// 일반클래스 Point
class Point {
	//멤버변수
	int x;
	int y;
	
	//생성자
	Point() {				//기본생성자
		this(0,0);
	}
	Point(int x, int y) {	//매개변수있는 생성자
		this.x = x;
		this.y = y;
	}
	
	//toString
	@Override
	public String toString() {
		return "["+x+","+y+"]";
	}
}


//자손클래스 Circle
class Circle extends Shape {
	//멤버변수
	double r;		// 반지름
	
	//생성자
	Circle() {					//기본생성자
		this(0);
	}		
	Circle(double r) {			//매개변수있는 생성자
		this.r = r;
	}

	//메서드
	// 추상메서드 구현
	@Override double calcArea() {
		return r*r*Math.PI;
	}
	
}


//자손클래스 Rectangle
class Rectangle extends Shape {
	//멤버변수
	double width;	// 폭
	double height;	// 높이
	
	//생성자
	Rectangle() {
		this(0,0);
	}
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//메서드
	// 추상메서드 구현
	@Override double calcArea() {
		return width*height;
	}
 	
	//정사각형인지 아닌지 알려주는 메서드
	boolean isSquare() {
		return (width == height);
	}

}