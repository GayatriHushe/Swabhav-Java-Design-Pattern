package com.techlab.test;
import com.techlab.model.GoldenHat;
import com.techlab.model.IHat;
import com.techlab.model.RibbonedHat;
import com.techlab.model.StandardHat;

public class HatTest {
	public static void main(String[] args) {
		IHat hat=new GoldenHat(new RibbonedHat(new StandardHat()));
		printHatInfo(hat);
	}

	private static void printHatInfo(IHat hat) {
		System.out.println("Hat name : "+hat.getName());
		System.out.println("Hat Price : "+hat.getPrice());
		System.out.println("Hat description : "+hat.getDesciption());
	}
}
