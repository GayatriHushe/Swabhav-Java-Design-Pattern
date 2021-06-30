package com.techlab.model;

public enum AutoType {
	BMW,AUDI,TESLA,MARUTI;
	@Override
	public String toString() {
		switch(this)
		{
		case BMW: return("Bmw");
		case AUDI: return("Audi");
		case TESLA: return("Tesla");
		case MARUTI: return ("Maruti");
		default : return null;
		}
	
	}
}
