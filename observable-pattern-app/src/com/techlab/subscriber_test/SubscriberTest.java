package com.techlab.subscriber_test;

import com.techlab.publisher.Account;
import com.techlab.subscriber.EmailNotifier;
import com.techlab.subscriber.SmsNotifier;

public class SubscriberTest {

	public static void main(String[] args) {

		Account acc1=new Account(1,"Gayatri",1000.0);
		acc1.addNotifier(new SmsNotifier());
		acc1.addNotifier(new EmailNotifier());
		showAccountInfo(acc1);
		
		acc1.deposit(1000.0);
		acc1.sendNotification();
		
		System.out.println("After deposit : ");
		showAccountInfo(acc1);
		
		Account acc2=new Account(2,"def",2000.0);
		showAccountInfo(acc2);
		System.out.println("After withdraw : ");
		acc2.withdraw(1500.0);
		if(!acc2.iswithdrawflag)
			System.out.println("Not sufficient balance");
		else
			showAccountInfo(acc2);
		
	}
	private static void showAccountInfo(Account a) {
		System.out.println("Account No : "+a.getAccNo());
		System.out.println("Account Name : "+a.getName());
		System.out.println("Balance : "+a.getBalance());
		System.out.println();
	}
}
