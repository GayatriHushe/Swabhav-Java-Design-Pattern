package com.techlab.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private int accNo;
	private String name;
	private double balance;
	private List<INotifier> notifiers=new ArrayList<INotifier>();
	private double min=500.0;
	public boolean iswithdrawflag;
	
	public Account(int accNo, String name, double balance) {
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return this.balance;
	}
	public void deposit(double amount) {
		this.balance+=amount;
	}
	public boolean withdraw(double amount) {
		if(this.balance-amount<=min)
			iswithdrawflag=false;
		else
			this.balance=this.balance-amount;
		return iswithdrawflag;
	}
	
	public void addNotifier(INotifier notifier)
	{
		notifiers.add(notifier);
	}

	public void sendNotification() {
		
			for (INotifier iNotifier : notifiers) {
				iNotifier.notify(this);
			}
	
		
	}
}
