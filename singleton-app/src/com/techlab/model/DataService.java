package com.techlab.model;

public class DataService {
	private static DataService bucket=null;
	private DataService()
	{
		System.out.println("Object is created by "+this.hashCode());
	}
	public void doSomething()
	{
		System.out.println("Work done by "+this.hashCode());
	}
	public static DataService getInstance() {
		// TODO Auto-generated method stub
		if (bucket == null)
        {
            bucket = new DataService();
        }
        return bucket;
	}
}
