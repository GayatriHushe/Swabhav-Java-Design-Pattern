package com.techlab.model;

public class TyreChange implements ICarService {
	
	private ICarService service;

	public TyreChange(ICarService service) {
		this.service=service;
	}
	@Override
	public double getCost() {
		return service.getCost()+350.0;
	}
	@Override
	public String getDetails() {
		return service.getDetails()+" with tyre change";
	}

}
