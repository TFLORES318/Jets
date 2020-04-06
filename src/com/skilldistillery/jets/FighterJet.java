package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
		super();
	}

	public FighterJet(String model, String name, double speed, int range, long price) {
		super(model, name, speed, range, price);
	}

	public void fly() {
		super.fly();
	}

	public void fight() {
		System.out.println(getName());
		System.out.println("Extend your weapon!");
	}

}
