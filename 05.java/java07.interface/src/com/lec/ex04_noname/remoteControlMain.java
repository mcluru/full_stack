package com.lec.ex04_noname;

import com.lec.ex02_implement.RemoteControl;

public class remoteControlMain {

	public static void main(String[] args) {
		
		// 1. 인터페이스는 객체 생성불가
//		RemoteControl rc = new RemoteControl();
		
		// 2. 익명구현객체
		RemoteControl tv = new RemoteControl() {
			
			public void turnOn() { System.out.println("파워온"); }
			public void turnOff() { System.out.println("파워오프"); }
			public void setVolumn(int volumn) { System.out.println("현재볼륨 = " + volumn); }
		};
		tv.turnOn();
		tv.setVolumn(100);
		tv.turnOff();
//		tv.changeBettery();	// (x)
		RemoteControl.changeBattery();
		System.out.println();
		
		
		RemoteControl audio = new RemoteControl() {
			public void turnOn() {/*실행블럭*/}
			public void turnOff() {/*실행블럭*/}
			public void setVolumn(int volumn) {/*실행블럭*/}
		};
		audio.turnOn();
		audio.setVolumn(100);
		audio.turnOff();

		
		RemoteControl radio = new RemoteControl() {
			public void turnOn() {System.out.println("라디오파워온");}
			public void turnOff() {/*실행블럭*/}
			public void setVolumn(int volumn) {/*실행블럭*/}
		};
		RemoteControl cd = new RemoteControl() {
			public void turnOn() {System.out.println("CD파워온");}
			public void turnOff() {/*실행블럭*/}
			public void setVolumn(int volumn) {/*실행블럭*/}
		};
		RemoteControl amp = new RemoteControl() {
			public void turnOn() {System.out.println("AMP 파워온");}
			public void turnOff() {/*실행블럭*/}
			public void setVolumn(int volumn) {/*실행블럭*/}
		};
		
	}

}
