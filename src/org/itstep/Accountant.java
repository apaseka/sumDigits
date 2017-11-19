package org.itstep;

import java.util.Scanner;

public class Accountant {
	int getFigures() {
		Scanner in = new Scanner(System.in);
		System.out.println("Tape a long integer!");
		String num;
		num = in.nextLine();
		 System.out.printf("You entered: %s\n", num);
		int figures = Integer.parseInt(num);
		return figures;
	}
}