package com.lec.exerxise.answer;

public class Exercise7_17 {

	public static void main(String[] args) {

	}

}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}


class Marine extends Unit {
	void move(int x, int y) {}
	void stimPack() {}
}

class Tank extends Unit {
	void move(int x, int y) {}
	void changeMode() {}
}

class Dropship extends Unit {
	void move(int x, int y) {}
	void load() {}
	void unload() {}
}
