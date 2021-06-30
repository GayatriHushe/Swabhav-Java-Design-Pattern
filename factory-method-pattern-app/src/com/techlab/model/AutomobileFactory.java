package com.techlab.model;

public class AutomobileFactory {
	private static AutomobileFactory factory;

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
		return factory;
	}


	public IAuto make(AutoType auto) {
		// TODO Auto-generated method stub
		if(auto.equals(AutoType.BMW))
		{
			return new Bmw();
		}
		else if(auto.equals(AutoType.AUDI))
		{
			return new Audi();
		}
		else if(auto.equals(AutoType.TESLA))
		{
			return new Tesla();
		}
		return null;
	}

}
