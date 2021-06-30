package com.techlab.model;

public class Audi implements IAuto {

	@Override
	public void start() {
		System.out.println("Audi is starting");
	}

	@Override
	public void stop() {
		System.out.println("Audi");
	}

	@Override
	public AutoType getName() {
		return AutoType.AUDI;
	}

}
