package com.lec.ex03_method_overriding;

public class superSonicAirplaneMain {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flymod = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymod = SuperSonicAirplane.NOMAL;
		sa.fly();
		sa.land();
		
		
		
		
	}

}
