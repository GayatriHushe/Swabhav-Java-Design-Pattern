package com.techlab.test;

import com.techlab.model.AutoType;
import com.techlab.model.AutomobileFactory;
import com.techlab.model.IAuto;

public class Test {

	public static void main(String[] args) {
		AutomobileFactory factory=new AutomobileFactory();
		
		IAuto bmw=factory.make(AutoType.BMW);
		displayCar(bmw);
	}

	private static void displayCar(IAuto car) {
		car.start();
		car.stop();
		System.out.println(car.getName());
		
	}

}
