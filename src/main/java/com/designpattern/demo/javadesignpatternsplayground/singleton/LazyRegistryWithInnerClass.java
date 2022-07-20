package com.designpattern.demo.javadesignpatternsplayground.singleton;

public class LazyRegistryWithInnerClass {

	private LazyRegistryWithInnerClass() { }

	private static class RegistryHolder {
		static LazyRegistryWithInnerClass INSTANCE = new LazyRegistryWithInnerClass();
	}

	public static LazyRegistryWithInnerClass getInstance() {
		return RegistryHolder.INSTANCE;
	}
}

