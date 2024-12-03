package com.logic.pradeep.sir;

import java.util.Scanner;
//Q12
public class FactorialByForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a num to find its factorial :-> ");
		int number = scanner.nextInt();

		scanner.close();

		long factorial = 1;

		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		System.out.println("Factorial of " + number + "is :->" + factorial);
	}

}
