package com.logic.string;

import java.util.Scanner;

public class StringLengthFinder_Q1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();
    
    int length = inputString.length();
    
    System.out.println("The length of the entered string is: " + length);
    
    scanner.close();

}
}
