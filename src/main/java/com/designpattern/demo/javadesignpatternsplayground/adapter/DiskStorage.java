package com.designpattern.demo.javadesignpatternsplayground.adapter;

public class DiskStorage implements ISaveData {

	@Override
	public void save() {
		System.out.println("save data to disk");
	}

}

