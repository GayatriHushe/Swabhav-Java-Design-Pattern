package com.techlab.model;

public class Maruti implements IAuto{
	@Override
	public void start() {
		System.out.println("Maruti is starting");
	}
	@Override
	public void stop() {
		System.out.println("Maruti is stoping");
	}
	@Override
	public AutoType getName() {
		return AutoType.MARUTI;
	}
}