package com.techlab.test;


import com.techlab.model.IAccount;
import com.techlab.model.AccountProxy;

public class Test {

	public static void main(String[] args) {
				
		IAccount acc1=new AccountProxy(1,"gayatri",5000); //Cheap
		acc1.deposit(1000);
		acc1.withdraw(200);

	}
}
