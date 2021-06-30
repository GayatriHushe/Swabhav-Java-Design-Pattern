package com.techlab.test;

import com.techlab.model.DataService;

public class Test {
	public static void main(String[] args) {
		DataService dsv1=DataService.getInstance();
		DataService dsv2=DataService.getInstance();
		//dsv1.doSomething();
		//dsv2.doSomething();
		System.out.println(dsv1.hashCode());
		System.out.println(dsv2.hashCode());
	}
}
