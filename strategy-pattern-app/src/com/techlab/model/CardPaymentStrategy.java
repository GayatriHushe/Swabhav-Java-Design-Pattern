package com.techlab.model;

public class CardPaymentStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CardPaymentStrategy(String name, String cardNumber, String cvvNumber, String expiryDate){
		this.name=name;
		this.cardNumber=cardNumber;
		this.cvv=cvvNumber;
		this.dateOfExpiry=expiryDate;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount +" paid with credit/debit card");
	}
	
	public String getName() {
		return name; 	}
	public String getCardNumber() {
		return cardNumber; 	}
	public String getCvv() {
		return cvv; 	}
	public String getDateOfExpiry() {
		return dateOfExpiry; 	}
}
