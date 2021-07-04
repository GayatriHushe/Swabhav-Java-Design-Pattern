package com.techlab.test;

import com.techlab.model.Phone;
import com.techlab.model.PhoneBuilder;

public class BuilderTest {
	public static void main(String[] args) {
		//Using constructor
		Phone phone1=new Phone("Android", 8, "QualComm", 6.5, 5000);
		System.out.println(phone1);
		
		//Using builder
		Phone phone2=new PhoneBuilder().setOs("Android").setRam(8).getPhone();
		System.out.println(phone2);
	}
}
