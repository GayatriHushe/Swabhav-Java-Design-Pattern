package com.techlab.test;

import com.techlab.model.WhatsappNotification;
import com.techlab.model.INotifier;
import com.techlab.model.TelegramNotification;
import com.techlab.model.StandardNotification;

public class NotificationTest {
	public static void main(String[] args) {
		INotifier notify=new WhatsappNotification(new TelegramNotification(new StandardNotification()));
		printNotificationInfo(notify);
	}

	private static void printNotificationInfo(INotifier notify) {
		System.out.println("Notification details : "+notify.sendMessage());
		
	}
}
