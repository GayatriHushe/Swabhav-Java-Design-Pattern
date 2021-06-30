package com.techlab.model;

public class AutomobileFactory {
	private IAuto auto;
	private AutoType autoType;
	private static IAuto bmw,audi,tesla;
	private static AutomobileFactory factory;
	
	public IAuto make(AutoType autoType) {
		// TODO Auto-generated method stub
		if(autoType.equals(AutoType.AUDI))
			return new Audi();
		else if(autoType.equals(AutoType.BMW))
			return new Bmw();
		else if(autoType.equals(AutoType.TESLA))
			return new Tesla();
		return null;
	}

	public static AutomobileFactory getInstance() {
		if(factory==null)
		{
			synchronized (AutomobileFactory.class) {
				if(factory==null)
				{
					factory=new AutomobileFactory();
				}
			}
		}
		return (AutomobileFactory) factory;
	}
	
}
