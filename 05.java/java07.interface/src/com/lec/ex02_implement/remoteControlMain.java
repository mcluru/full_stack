package com.lec.ex02_implement;

public class remoteControlMain {

	public static void main(String[] args) {
		
//		Television tv = new Television();
//		Audio audio = new Audio();
		
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolumn(5);
		rc.setMute(true);
		rc.turnOff();
		System.out.println();
		
		rc = new Audio();	// Audio button click
		rc.turnOn();
		rc.setVolumn(20);
		rc.setMute(true);
		rc.turnOff();
		
		// 건전지교환 - static method
		RemoteControl.changeBattery();
		
		
		
	}

}
