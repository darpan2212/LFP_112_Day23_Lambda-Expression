package com.lambda.math;

@FunctionalInterface
public interface IMathFunction {

	int calculate(int a, int b);

	public static void printResult(int a, int b,
			String function, IMathFunction fObj) {
		System.out.println("Result of " + function
				+ " is : (" + a + "," + b + ")"
				+ fObj.calculate(a, b));
	}

}