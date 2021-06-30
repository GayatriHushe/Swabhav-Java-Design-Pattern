package com.techlab.model;

public class CarInspection implements ICarService{
	
	@Override
	public double getCost() {
		return 250.0;
	}
	@Override
	public String getDetails() {
		return "Car Inspection";
	}
}
