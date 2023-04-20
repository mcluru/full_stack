package com.lec.robot.v2_상속;

public class RobotMain {

	public static void main(String[] args) {		
		
		System.out.println("=== Robot V2.0 (상속) ===");
		System.out.println();
		
		CheapRobot cheapRobot = new CheapRobot("CheapRobot", 10);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name + "의 재고수량 = " + cheapRobot.qty);
		System.out.println();
		
		
		StandardRobot standardRobot = new StandardRobot("StandardRobot", 10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println(standardRobot.name + "의 재고수량 = " + standardRobot.qty);
		System.out.println();
		
		
		SuperRobot superRobot = new SuperRobot("SuperRobot", 10);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println(superRobot.name + "의 재고수량 = " + superRobot.qty);
		
		
	}

}
