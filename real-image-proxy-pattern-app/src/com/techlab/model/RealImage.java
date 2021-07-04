package com.techlab.model;

public class RealImage implements IImage {

	private String name;

	public RealImage(String name) {
		this.name=name;
		System.out.println("Loading "+name);
	}

	@Override
	public void display() {
		System.out.println("Displaying "+name);
		
	}
	
	

}
