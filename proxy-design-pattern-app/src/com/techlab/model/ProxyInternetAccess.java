package com.techlab.model;

public class ProxyInternetAccess implements OfficeInternetAccess {  
	private String employeeName;  
	private RealInternetAccess realAccess;
	private int role;  
	
	public ProxyInternetAccess(String employeeName) {  
		this.employeeName = employeeName;  
	}  
	
	@Override  
	public void grantInternetAccess()   
	{  
		if (getRole(employeeName) > 4)   
		{  
			realAccess = new RealInternetAccess(employeeName);  
			realAccess.grantInternetAccess();  
		}   
		else   
		{  
			System.out.println("No Internet access granted. Your job level is below 5");  
		}  
	}  
	
	public int getRole(String emplName) {  
		
		return role;  
	}

	//@Override
	public void setRole(int role) {
		this.role=role;		
	}  
}  