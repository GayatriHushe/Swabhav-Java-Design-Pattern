package com.techlab.model;

public class PremiumHat implements IHat {

	@Override
	public String getName() {
		return "Premium Hat";
	}
	@Override
	public int getPrice() {
		return 70;
	}
	@Override
	public String getDesciption() {
		return "This is Premium Hat";
	}

}
