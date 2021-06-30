package com.techlab.model;

public class OilChange implements ICarService {
	
	private ICarService service;

	public OilChange(ICarService service) {
		this.service=service;
	}
	@Override
	public double getCost() {
		return service.getCost()+1200.0;
	}
	@Override
	public String getDetails() {
		return service.getDetails()+" with oil change";
	}

	
	
}
