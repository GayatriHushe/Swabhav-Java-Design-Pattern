package com.techlab.model;

public class TelegramNotification implements INotifier {
	
	private INotifier notifier;

	public TelegramNotification(INotifier notifier) {
		this.notifier=notifier;
	}

	@Override
	public String sendMessage() {
		
		return notifier.sendMessage()+" to Telegram";
	}

}
