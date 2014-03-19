package com.nsc.java8;

public interface DefaultMethod {

	public String test();
	
	default void common(){
		System.out.println("test common..");
	}
	
}
