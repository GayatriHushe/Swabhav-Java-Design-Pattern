package com.techlab.model;

public class MarutiFactory implements IAutoFactory {
	private static MarutiFactory factory;
	public static MarutiFactory getInstance() {
		if(factory==null)
		{
			synchronized (MarutiFactory.class) {
				if(factory==null)
				{
					factory=new MarutiFactory();
				}
			}
		}
		return factory;
	}
	@Override
	public IAuto make() {
		// TODO Auto-generated method stub
		return new Maruti();
	}
}
