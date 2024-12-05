package com.logic.pattern;

public class Q9 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print((i * 3 + j) + " ");
				// calculates and prints the sequence of numbers 1 2 3, 4 5 6, 7 8 9
			}
			for (int j = 0; j < 3; j++) {
				System.out.print("@ ");// middle part //
			}
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1) {
					System.out.print("2 ");
				} else {
					System.out.print("1 ");
				}
			}
			System.out.println();

		}

	}

}
