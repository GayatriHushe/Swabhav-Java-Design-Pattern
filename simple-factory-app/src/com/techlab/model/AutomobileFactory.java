package com.techlab.model;

public class AutomobileFactory {

	public IAuto make(AutoType car) {
		// TODO Auto-generated method stub
		if(car.equals(AutoType.BMW))
		{
			return new Bmw();
		}
		else if(car.equals(AutoType.AUDI))
		{
			return new Audi();
		}
		else if(car.equals(AutoType.TESLA))
		{
			return new Tesla();
		}
		return null;
	}
	
}
