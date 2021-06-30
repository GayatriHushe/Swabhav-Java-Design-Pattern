package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.INotifier;

public class SmsNotifier implements INotifier{

	
	@Override
	public void notify(Account account) {
		System.out.println("SMS notification : Your Updated Balance is "+account.getBalance());
		
	}

}
