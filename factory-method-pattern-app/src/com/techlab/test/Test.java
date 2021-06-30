package com.techlab.test;

import com.techlab.model.BmwFactory;
import com.techlab.model.IAuto;
import com.techlab.model.IAutoFactory;
import com.techlab.model.MarutiFactory;
import com.techlab.model.TeslaFactory;

public class Test {

	public static void main(String[] args) {
		
		IAutoFactory factory1=BmwFactory.getInstance();
		IAuto auto=factory1.make();
		System.out.println("Automobile Name : "+auto.getName());
		auto.start();
		auto.stop();
		System.out.println("Factory hashcode : "+factory1.hashCode());
	}
}



/*
IAutoFactory factory2=BmwFactory.getInstance();
System.out.println(factory2.hashCode());
*/