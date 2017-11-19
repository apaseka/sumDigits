package org.itstep;


import org.itstep.arithmetic.ArithmeticSolution;
import org.itstep.logicalsolution.LogicalSolution;

public class AppRunnerSumDigits {

	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		ArithmeticSolution arithmeticSolution = new ArithmeticSolution();
		LogicalSolution LogicalSolution = new LogicalSolution();
		int figures = accountant.getFigures();
		arithmeticSolution.doArithmetic(figures);
		LogicalSolution.doLogical(figures);
	}
}
