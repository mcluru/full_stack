package com.lec.robot.v8_final;

import com.lec.robot.v4_인터페이스.inter.*;

public class Robot {
	
	InterFly fly;
	InterMissile missile;
	InterSword sword;
	
	public String name;
	public int qty;
	
	public Robot() {};
	public Robot(String name, int qty, InterFly fly, InterMissile missile, InterSword sword) {
		this.name = name;
		this.qty = qty;
		this.fly = fly;
		this.missile = missile;
		this.sword = sword;
	}
	
	// 공통기능
	public void shape() {System.out.println(this.name + "Robot입니다! 팔, 다리, 머리, 몸통이 있습니다.");}
	public void actionWalk() { System.out.println("걸을 수가 있습니다"); }
	public void actionRun() { System.out.println("달릴 수가 있습니다"); }

	
	// 개별기능
	public void actionFly() {
		fly.fly();
	}
	public void actionMissile() {
		missile.missile();
	}
	public void actionSword() {
		sword.sword();
	}
	
	// 생산공장
	public void makeRobot() {
		shape();
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
		System.out.println(this.toString());
		System.out.println();
	}
	
	public void makeRobot(InterFly fly, InterMissile missile, InterSword sword) {
		shape();
		actionWalk();
		actionRun();
		actionFly();
		actionMissile();
		actionSword();
		System.out.println(this.toString());
		System.out.println();
	}
	
	@Override
	public String toString() {
		return this.name + "의 재고수량 = " + this.qty;
	}
	
	
}
