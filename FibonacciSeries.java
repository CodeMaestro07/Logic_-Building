package com.logic.pradeep.sir;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10; // Number of terms

		// Initialize the first two terms
		int a = 0;
		int b = 1;

		System.out.print("Fibonacci Series up to " + n + " terms: ");

		// Loop to generate Fibonacci series
		for (int i = 0; i < n; i++) {
			// Print the current term
			System.out.print(a + " ");
			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}
	}
}
