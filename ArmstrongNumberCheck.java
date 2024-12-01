package com.logic.While_Loop;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        // Handle negative numbers
        if (number < 0) {
            System.out.println(number + " is not an Armstrong number because negative numbers are not considered.");
            scanner.close();
            return;
        }

        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = 0;

        // Calculate the number of digits
        int tempNumber = originalNumber;
        while (tempNumber > 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of each digit raised to the power of the number of digits
        tempNumber = originalNumber;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum += Math.pow(digit, numberOfDigits);
            tempNumber /= 10;
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
	}

}
