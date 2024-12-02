package com.logic.pradeep.sir;

import java.util.Scanner;

public class ArithmeticOperationsMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("1 : Addition ");
		System.out.println("2 : Subtraction ");
		System.out.println("3 : Multiplication");
		System.out.println("4 : Division");
		System.out.println("Enter your choice (1-4):");
		int choice = sc.nextInt();
		System.out.println("Enter the first integer :");
		int num1 = sc.nextInt();
		System.out.println("Enter the second integer :");
		int num2 = sc.nextInt();
		double result;
		switch (choice) {
		case 1:
			// Addition
			result = num1 + num2;
			System.out.println("Result of Addition: " + result);
			break;
		case 2:
			// subtraction
			result = num1 - num2;
			System.out.println("Result of Subtraction:" + result);
		//	return = result != -;
		    break;
		case 3:
			// Multiplication
			result = num1 * num2;
			System.out.println("Result of Multiplication:" + result);
			break;
		case 4:
			// Division
			if (num2 != 0) {
				result = (double) num1 / num2;
				System.out.println("Result of Division: " + result);
			} else {
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
		default:
			// invalid choice(bcz choice is only between 1 - 4)
			System.out.println("Invalid choice. Please enter a number between 1 and 4.");
			break;
		}
		sc.close();
	}
}
