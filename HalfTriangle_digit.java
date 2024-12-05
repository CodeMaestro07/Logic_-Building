package com.logic.pattern;

public class HalfTriangle_digit {
	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i--) {
			for (int j = 1; j <= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

}
