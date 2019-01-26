package com.lambda;

public class ExecutionLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctInterface fintObj = (int y)->{
			System.out.println("Input number is: "+ y);
			return 2*y;	
		};
		
		int returnedValue = fintObj.abstractFunction(5);
		
		System.out.println("Returned value is "+ returnedValue);

	}
	
	

}
