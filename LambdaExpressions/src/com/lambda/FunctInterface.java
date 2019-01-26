package com.lambda;

public interface FunctInterface {
	
	public int abstractFunction(int x);
	
	public default void normalFunction() {
		System.out.println("This is the default and normal function");
	}
	
	

}
