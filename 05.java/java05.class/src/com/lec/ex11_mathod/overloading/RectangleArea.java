package com.lec.ex11_mathod.overloading;

public class RectangleArea {
	
	// 정사각형의 넒이
	int areaRectangle(int width) {
		return width * width;
	}
	
	// 직사각형의 넚이 - overloading
	int areaRectangle(int width, int height) {
		return width * height;
	}
	
	
}
