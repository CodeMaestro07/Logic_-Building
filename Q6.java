package com.logic.pattern;

public class Q6 {

	public static void main(String[] args) {
		int c = 4;
		int r = 5;

		for (int i = 1; i <= c; i++) {
			for (int j = 1; j <= r; j++) {
				if (i == 1 || i == 3) {
					System.out.print("#");
				} else {
					System.out.print("@");
				}
			}
			System.out.println();
		}

	}
}
