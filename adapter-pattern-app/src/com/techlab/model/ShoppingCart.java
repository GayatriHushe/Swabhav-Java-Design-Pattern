package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items=new ArrayList<Item>();
	Item item;
	double totalPrice;
	
	public void addItem(Item item) {
		items.add(item);
		totalPrice+=item.itemPrice();
	}
	public void removeItem(Item item) {
		items.remove(item);
		totalPrice-=item.itemPrice();
	}
	public double totalPrice() {
		return totalPrice;
	}
	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + ", item=" + item + ", totalPrice=" + totalPrice + "]";
	}
}
