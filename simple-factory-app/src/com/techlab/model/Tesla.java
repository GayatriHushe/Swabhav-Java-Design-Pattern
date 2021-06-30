package com.techlab.model;

public class Tesla implements IAuto {

	@Override
	public void start() {
		System.out.println("Tesla is starting");
	}

	@Override
	public void stop() {
		System.out.println("Tesla");
	}

	@Override
	public AutoType getName() {
		return AutoType.TESLA;
	}

}
