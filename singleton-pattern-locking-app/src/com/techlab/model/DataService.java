package com.techlab.model;

public class DataService {
	private static DataService bucket=null;
	private DataService()
	{	System.out.println("Object is created by "+this.hashCode()); }
	public void doSomething()
	{	System.out.println("Work done by "+this.hashCode()); }

	/*
	//single lock
	public static DataService getInstance() 
	{
		if (bucket == null)
		{
			if (bucket == null)
				bucket = new DataService();
		}
		return bucket;
	}
	 */

	//double lock
	public static DataService getInstance() 
	{
		if (bucket == null)
		{
			synchronized (DataService.class) 
			{
				if (bucket == null)
					bucket = new DataService();
			}
		}
		return bucket;
	}
	
}
