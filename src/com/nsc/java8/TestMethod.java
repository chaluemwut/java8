package com.nsc.java8;

public class TestMethod {
	
	public static void main(String[] args) {
		DefaultMethod d = new DefaultMethod() {
			
			@Override
			public String test() {
				common(); // เรียก default method
				return "test";
			}
		};
		d.test();
	}

}
