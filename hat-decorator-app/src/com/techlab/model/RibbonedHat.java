package com.techlab.model;

public class RibbonedHat implements IHat {
	private IHat hat;

	public RibbonedHat(IHat hat) {
		this.hat=hat;
	}
	public int getPrice() {
		return hat.getPrice()+50;
	}
	public String getDesciption() {
		return hat.getDesciption()+" with ribbon";
	}

	@Override
	public String getName() {
		return hat.getName();
	}
}
