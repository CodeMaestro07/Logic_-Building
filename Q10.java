package com.logic.pattern;

public class Q10 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
            // Inner loop for the columns
            for (int j = 0; j < 5; j++) {
                System.out.print((i + j) + " ");
            }
            // Move to the next line after each row
            System.out.println();
	}

	}
}
