package com.techlab.test;

import com.techlab.model.OilChange;
import com.techlab.model.ICarService;
import com.techlab.model.TyreChange;
import com.techlab.model.CarInspection;

public class CarServiceTest {
	public static void main(String[] args) {
		ICarService service=new OilChange(new TyreChange(new CarInspection()));
		printServiceInfo(service);
	}

	private static void printServiceInfo(ICarService service) {
		System.out.println("Car Service Price : "+service.getCost());
		System.out.println("Car service Details : "+service.getDetails());
	}
}
