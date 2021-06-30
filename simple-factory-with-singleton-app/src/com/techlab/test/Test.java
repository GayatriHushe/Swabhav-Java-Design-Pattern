package com.techlab.test;

import com.techlab.model.AutoType;
import com.techlab.model.AutomobileFactory;
import com.techlab.model.IAuto;

public class Test {

	public static void main(String[] args) {
		AutomobileFactory factory=AutomobileFactory.getInstance();
		AutomobileFactory factory2=AutomobileFactory.getInstance();
		
		IAuto bmw1=factory.make(AutoType.BMW);
		displayCar(bmw1);
		
		IAuto bmw2=factory.make(AutoType.BMW);
		displayCar(bmw2);
		
		System.out.println(factory.hashCode());
		System.out.println(factory2.hashCode());
	}
	private static void displayCar(IAuto auto) {
		auto.start();
		auto.stop();
		System.out.println(auto.getName());
		System.out.println(auto.hashCode());
		System.out.println();
	}
}
