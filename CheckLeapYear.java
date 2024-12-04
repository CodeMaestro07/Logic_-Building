package com.logic.pradeep.sir;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year :");
		int year = sc.nextInt();
		sc.close();
		boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
		if (isLeapYear) {
			System.out.println(year + ": is a leap year");
		} else {
			System.out.println(year + ": is not a leap year");
		}

	}

}
