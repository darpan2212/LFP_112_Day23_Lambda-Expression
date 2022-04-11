package com.lambda.math;

public class LambdaExample {
	
	public static void main(String[] args) {

		IMathFunction add = (x, y) -> x + y;

		System.out.println("Addition is : 5+4 = "
				+ add.calculate(5, 4));

		IMathFunction multiply = (x, y) -> x * y;
		System.out.println("Multiplication is : 7*8 = "
				+ multiply.calculate(7, 8));

		IMathFunction division = (x, y) -> x / y;
		System.out.println("Division is : 50/5 = "
				+ division.calculate(50, 5));

		IMathFunction.printResult(14, 17, "Addition", add);
		IMathFunction.printResult(12, 11, "Multiplication",
				multiply);
		IMathFunction.printResult(500, 100, "Division",
				division);
	}

}