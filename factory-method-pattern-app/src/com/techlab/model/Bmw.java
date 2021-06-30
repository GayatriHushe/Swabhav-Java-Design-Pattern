package com.techlab.model;

public class Bmw implements IAuto{
	@Override
	public void start() {
		System.out.println("BMW is starting");
	}
	@Override
	public void stop() {
		System.out.println("BMW is stoping");
	}
	@Override
	public AutoType getName() {
		return AutoType.BMW;
	}
}
