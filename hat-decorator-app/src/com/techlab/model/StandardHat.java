package com.techlab.model;

public class StandardHat implements IHat{

	@Override
	public String getName() {
		return "Standard Hat";
	}
	@Override
	public int getPrice() {
		return 50;
	}
	@Override
	public String getDesciption() {
		return "This is Standard Hat";
	}

}
