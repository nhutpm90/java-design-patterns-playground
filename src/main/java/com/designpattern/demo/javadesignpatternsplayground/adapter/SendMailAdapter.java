package com.designpattern.demo.javadesignpatternsplayground.adapter;

import com.designpattern.demo.javadesignpatternsplayground.adapter.external.ISendData;

public class SendMailAdapter implements ISaveData {

	private ISendData sendData;

	public SendMailAdapter(ISendData sendData) {
		this.sendData = sendData;
	}

	@Override
	public void save() {
		this.sendData.send();
	}

}

