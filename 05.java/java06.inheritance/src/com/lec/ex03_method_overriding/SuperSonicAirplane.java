package com.lec.ex03_method_overriding;

public class SuperSonicAirplane extends Airplane {
	
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	int flymod = NOMAL;
	
	
	@Override
	void fly() {
		if(flymod == NOMAL) {
			super.fly();
		} else {
			System.out.println("초음속비행...");
		}
	}
	
	
}
