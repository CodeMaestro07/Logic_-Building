package com.logic.While_Loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to find its factorial: ");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Factorial is not defined for negative number");
		} else {
			int factorial = 1;
			int i = num;

			while (i > 0) {
				factorial *= i;
				i--;
			}
			System.out.println("The factorial of " + num + " is " + factorial);
		}
		sc.close();
	}

}
