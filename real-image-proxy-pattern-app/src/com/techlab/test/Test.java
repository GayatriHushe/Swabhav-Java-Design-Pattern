package com.techlab.test;


import com.techlab.model.IImage;
import com.techlab.model.ProxyImage;
import com.techlab.model.RealImage;

public class Test {

	public static void main(String[] args) {
		IImage image1=new RealImage("1.jpg"); //Expensive
		image1.display();
		
		IImage image2=new ProxyImage("2.jpg"); //Cheap
		image2.display();

	}

}
