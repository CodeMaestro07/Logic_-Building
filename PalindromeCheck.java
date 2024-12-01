package com.logic.While_Loop;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = scanner.nextInt();

        // Handle negative numbers and zero
        if (number < 0) {
            System.out.println(number + " is not a palindrome because negative numbers are not considered palindromes.");
            scanner.close();
            return;
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;    // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10;               // Remove the last digit
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }

        scanner.close();
	}

}
