package com.techlab.model;

public class RealInternetAccess implements OfficeInternetAccess {  
	private String employeeName;
	private int role;  
	
	public RealInternetAccess(String employeeName) {  
		this.employeeName = employeeName;  
	}  
	
	@Override  
	public void grantInternetAccess() {  
		System.out.println("Internet Access granted for employee: "+ employeeName);  
	}

	
	@Override
	public void setRole(int role) {
		this.role=role;
		
	}  
	
}