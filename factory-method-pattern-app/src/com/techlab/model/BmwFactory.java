package com.techlab.model;

public class BmwFactory implements IAutoFactory {
	private static BmwFactory factory;

	public static BmwFactory getInstance() {
		if(factory==null)
		{
			synchronized (BmwFactory.class) {
				if(factory==null)
				{
					factory=new BmwFactory();
				}
			}
		}
		return factory;
	}
	
	
	@Override
	public IAuto make() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
