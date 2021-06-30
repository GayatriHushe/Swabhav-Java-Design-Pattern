package com.techlab.model;

public enum AutoType {
	BMW,AUDI,TESLA;
	@Override
	public String toString() {
		switch(this)
		{
		case BMW: return("Bmw");
		case AUDI: return("Bmw");
		case TESLA: return("Bmw");
		default : return null;
		}
	
	}
}
