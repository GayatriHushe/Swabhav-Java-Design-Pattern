package com.techlab.model;

public class OnlineBankingStrategy implements PaymentStrategy {
	private String emailId;
	private String password;

	public OnlineBankingStrategy(String emailId, String password){
		this.emailId=emailId;
		this.password=password;
	}
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Online Banking.");
	}
	public String getEmailId() {
		return emailId; 	}
	public String getPassword() {
		return password; 	}
}
