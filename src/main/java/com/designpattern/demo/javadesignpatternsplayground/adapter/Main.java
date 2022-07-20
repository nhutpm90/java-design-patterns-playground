package com.designpattern.demo.javadesignpatternsplayground.adapter;

import com.designpattern.demo.javadesignpatternsplayground.adapter.external.ISendData;
import com.designpattern.demo.javadesignpatternsplayground.adapter.external.SendMail;

public class Main {
	
	public static void main(String[] args) {
		ISaveData diskStorage = new DiskStorage();
		diskStorage.save();
		
		// using adapter
		ISendData sendData = new SendMail();
		ISaveData sendMailAdatper = new SendMailAdapter(sendData);
		sendMailAdatper.save();
	}
}

