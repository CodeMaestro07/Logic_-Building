package com.logic.pattern;

public class Q5_Pattern {

	public static void main(String[] args) {
		int r = 3;
		int c = 9;

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (j == 4 || j == 5 || j == 6) {
					System.out.print("@ ");
				} else {
					System.out.print(j + " ");
				}
			}

			System.out.println();
		}
	}

}
