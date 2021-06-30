package com.techlab.test;

import com.techlab.model.OfficeInternetAccess;
import com.techlab.model.ProxyInternetAccess;

public class Test {
	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Gayatri");  
		//access.setRole(3);
		access.setRole(7);
        access.grantInternetAccess();
	}
}
