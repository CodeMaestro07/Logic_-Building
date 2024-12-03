package com.logic.pradeep.sir;

import java.util.Scanner;

public class FindProfitORLoss {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Get the cost price from the user
		System.out.print("Enter the cost price: ");
		double costPrice = scanner.nextDouble();

		// Get the selling price from the user
		System.out.print("Enter the selling price: ");
		double sellingPrice = scanner.nextDouble();

		// Calculate profit or loss
		if (sellingPrice > costPrice) {
			double profit = sellingPrice - costPrice;
			System.out.println("Profit: " + profit);
		} else if (sellingPrice < costPrice) {
			double loss = costPrice - sellingPrice;
			System.out.println("Loss: " + loss);
		} else {
			System.out.println("No profit, no loss");
		}

		// Close the scanner
		scanner.close();
	}

}
