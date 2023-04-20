package com.lec.robot.v8_final;

import com.lec.robot.v4_인터페이스.impl.*;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("=== Robot V8.0 (Final) ===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new Robot("Cheap", 5, new FlyYes(), new MissileYes(), new SwordWood());
		robot.makeRobot();
		robot = new Robot("Standard", 5, new FlyYes(), new MissileYes(), new SwordWood());
		robot.makeRobot();
		robot = new Robot("Super", 5, new FlyYes(), new MissileYes(), new SwordWood());
		robot.makeRobot();
		
		// 실습
		// 1. v4에서 setter를 없애는 로직
		// 2. v8에서 method다형성(makeRobot(InterFly, InterMissile, InterSword))
		
	}

}
