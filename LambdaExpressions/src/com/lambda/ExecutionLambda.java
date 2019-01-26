package com.lambda;

public class ExecutionLambda {
	
	interface OperationInner{
		public int perfomrInnerOperation(int x, int y);
	}
	
	private int operate(int x, int y, OperationInner anInnerOp) {
		return anInnerOp.perfomrInnerOperation(x, y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctInterface fintObj = (int y)->{
			System.out.println("Input number is: "+ y);
			return 2*y;	
		};
		
		int returnedValue = fintObj.abstractFunction(5);
		
		System.out.println("Returned value is "+ returnedValue);
		
		InterfaceZeroArg zeroArgObj =  () -> {
			System.out.println("DXrawing with zero inetrafce");
		};
		zeroArgObj.draw();
		
		Operation anAddOp1 = (int x,int y)->{
			return x+y;
		};
		
		Operation anMulOp = (int x, int y)->{
			return x*y;
		};
		
		System.out.println("Add lambda: " + anAddOp1.performOperation(4, 5));
		System.out.println("Mul lambda: " + anMulOp.performOperation(4, 5));
		
		ExecutionLambda anExeObj = new ExecutionLambda();
		
		OperationInner anInnerSubOp = (int x,int y)->{
			return x-y;
		};
		
		OperationInner anInnerDivOp = (int x, int y)->{
			return x/y;
		};
		
		System.out.println("substraction operation by passing as parameter"+anExeObj.operate(6, 7, anInnerSubOp));
		
		/* A Test Comment*/
		
	}

}
