package com.techlab.model;

public class StandardNotification implements INotifier{

	@Override
	public String sendMessage() {
		return "Standard Notification sent";
	}


}
