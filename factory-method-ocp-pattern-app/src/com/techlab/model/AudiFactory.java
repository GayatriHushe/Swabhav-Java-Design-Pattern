package com.techlab.model;

public class AudiFactory implements IAutoFactory {
	private static AudiFactory factory;
	public static AudiFactory getInstance() {
		if(factory==null)
		{
			synchronized (AudiFactory.class) {
				if(factory==null)
				{
					factory=new AudiFactory();
				}
			}
		}
		return factory;
	}
	@Override
	public IAuto make() {
		// TODO Auto-generated method stub
		return new Audi();
	}
}
