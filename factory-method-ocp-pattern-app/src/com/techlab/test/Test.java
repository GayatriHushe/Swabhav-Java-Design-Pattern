package com.techlab.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.techlab.model.AudiFactory;
import com.techlab.model.BmwFactory;
import com.techlab.model.IAuto;
import com.techlab.model.IAutoFactory;
import com.techlab.model.MarutiFactory;
import com.techlab.model.TeslaFactory;

public class Test {

	private static Class concreteClass;

	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
				
		FileReader f1=new FileReader("D:\\java swabhav design pattern\\factory-method-ocp-pattern-app\\src\\resources\\factory.properties");
		Properties p=new Properties();
		p.load(f1);
		
		String className=p.getProperty("currentfactory");
		
		concreteClass=Class.forName(className);
		
		IAutoFactory factory1=(IAutoFactory) concreteClass.newInstance();
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