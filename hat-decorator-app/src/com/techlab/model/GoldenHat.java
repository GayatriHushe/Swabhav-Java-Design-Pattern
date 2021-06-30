package com.techlab.model;

public class GoldenHat implements IHat {
	private IHat hat;

	public GoldenHat(IHat hat) {
		this.hat=hat;
	}
	public int getPrice() {
		return hat.getPrice()+50;
	}
	public String getDesciption() {
		return hat.getDesciption()+" with golden color";
	}

	@Override
	public String getName() {
		return hat.getName();
	}
}
