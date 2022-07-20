package com.designpattern.demo.javadesignpatternsplayground.adapter.external;

public class SendMail implements ISendData {

	@Override
	public void send() {
		System.out.println("send data mail");
	}
}

