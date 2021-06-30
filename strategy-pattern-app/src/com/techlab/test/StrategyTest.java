package com.techlab.test;

import com.techlab.model.CardPaymentStrategy;
import com.techlab.model.Item;
import com.techlab.model.OnlineBankingStrategy;
import com.techlab.model.ShoppingCart;

public class StrategyTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("book",40);
		Item item2 = new Item("pen",10);

		cart.addItem(item1);
		cart.addItem(item2);

		cart.pay(new OnlineBankingStrategy("gayatrihushe@gmail.com", "gayatri"));
		cart.pay(new CardPaymentStrategy("Gayatri Hushe", "1111222233334444", "123", "10/25"));
	}
}
