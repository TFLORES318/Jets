package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {
		super();
	}

	public CargoPlane(String model, String name, double speed, int range, long price) {
		super(model, name, speed, range, price);
	}

	public void fly() {
		super.fly();
	}

	public void loadCargo() {
		System.out.println(getName());
		System.out.println("Carefully and swiftly loading cargo.");
	}

}
