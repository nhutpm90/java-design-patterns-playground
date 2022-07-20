package com.designpattern.demo.javadesignpatternsplayground.singleton;

public class Main {
	
	public static void main(String[] args) {
		EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
		EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
		System.out.println("compare:: eagerRegistry1 == eagerRegistry2\n" 
								+ (eagerRegistry1 == eagerRegistry2));
		
		LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
		LazyRegistry lazyRegistry2 = LazyRegistry.getInstance();
		System.out.println("compare:: lazyRegistry1 == lazyRegistry2\n" 
				+ (lazyRegistry1 == lazyRegistry2));
	}
	
}

