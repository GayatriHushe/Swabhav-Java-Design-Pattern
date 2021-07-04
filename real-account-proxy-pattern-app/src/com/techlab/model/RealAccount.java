package com.techlab.model;

import java.time.LocalDateTime;

public class RealAccount implements IAccount {
	private String name;
	private int id;
	private int balance;

	public RealAccount(int id,String name, int balance) {
		this.name=name;
		this.id=id;
		this.balance=balance;
		System.out.println("Loading "+name);
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
		System.out.println("Time before deposit : "+LocalDateTime.now()+" Balance : "+balance);
		this.balance+=amount;
		System.out.println("Time after deposit : "+LocalDateTime.now()+" Balance : "+balance);		
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
