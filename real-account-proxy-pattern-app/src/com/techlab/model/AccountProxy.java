package com.techlab.model;

import java.time.LocalDateTime;

public class AccountProxy implements IAccount {
	private RealAccount account;
	private String name;
	private int id;
	private int balance;

	public AccountProxy(int id, String name, int balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getBalance() {
		return balance;
	}
	
	@Override
	public void deposit(int amount) {
		System.out.println("Time before deposit :"+LocalDateTime.now()+" Balance : "+balance);
		this.balance+=amount;
		System.out.println("Time after deposit :"+LocalDateTime.now()+" Balance : "+balance);		
	}

	@Override
	public void withdraw(int amount) {
		int min=1000;
		if((this.balance-amount)>min)
			System.out.println("Time before withdraw :"+LocalDateTime.now()+" Balance : "+balance);
			this.balance-=amount;
			System.out.println("Time before deposit :"+LocalDateTime.now()+" Balance : "+balance);
	}	
}
