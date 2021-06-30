package com.techlab.test;

import com.techlab.model.ShoppingCart;
import com.techlab.product.Hat;
import com.techlab.product.HatAdapter;

public class Test {

	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		cart.addItem(new HatAdapter(new Hat("ht","Hat",20.0)));
		printDetails(cart);
	}
	private static void printDetails(ShoppingCart cart) {
		System.out.println(cart);
		System.out.println("Total Price : "+cart.totalPrice());
		
	}
}
