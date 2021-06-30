package com.techlab.model;

public class WhatsappNotification implements INotifier {
	private INotifier notifier;

	public WhatsappNotification(INotifier notifier) {
		this.notifier=notifier;
	}
	
	@Override
	public String sendMessage() {
		return notifier.sendMessage()+" to Whatsapp";
	}
}
