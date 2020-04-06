package com.skilldistillery.jets;

public abstract class Jet {

	private String model;
	private String name;
	private double speed;
	private int range;
	private long price;

	public Jet() {
	}

	public Jet(String model, String name, double speed, int range, long price) {
		super();
		this.model = model;
		this.name = name;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [model=" + model + ", name=" + name + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ "]";
	}

	public void fly() {
		System.out.println(" model=" + model + ", name=" + name + ", speed=" + speed + ", range=" + range + ", price="
				+ price + " flight time before fuel is gone " + jetFlightTimePerFuel() + " hours and mach speed is " +speedInMach());
	}

	public double jetFlightTimePerFuel() {
		return (range / speed);
	}

	public double speedInMach() {
		return (speed / 767.269);

	}

	public String getModel() {
		return model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
