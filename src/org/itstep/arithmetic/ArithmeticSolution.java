package org.itstep.arithmetic;

import java.util.Scanner;

public class ArithmeticSolution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Tape a long integer!");
		int num = in.nextInt();
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
