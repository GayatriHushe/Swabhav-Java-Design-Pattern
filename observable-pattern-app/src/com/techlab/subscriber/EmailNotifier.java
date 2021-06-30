package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.INotifier;

public class EmailNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("Email notification : Your Updated Balance is "+account.getBalance());
		
	}
}
