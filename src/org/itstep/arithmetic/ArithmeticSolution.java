package org.itstep.arithmetic;

public class ArithmeticSolution {
	public void doArithmetic(int figures) {

		int num = figures;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of your digits is: " + sum);
	}
}
