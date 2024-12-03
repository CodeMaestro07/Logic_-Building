package com.logic.pradeep.sir;

import java.util.Scanner;

public class NumberSignChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("Number is positive and greator than zero");
		} else if (num < 0) {
			System.out.println("Number is Negative and less than zero");
		} else {
			System.out.println("Number is zero");
		}

	}

}
