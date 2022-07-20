package com.designpattern.demo.javadesignpatternsplayground.factorymethod;

public class Main {
	
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("SMS");
		notification.notifyUser();
	}
	
}

