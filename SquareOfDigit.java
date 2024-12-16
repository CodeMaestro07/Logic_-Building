package com.tka.basic;

import java.util.Scanner;

public class SquareOfDigit {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n =sc.nextInt();
		
		int rem=0;
		
		while(n>0) {
			
			rem = n % 10;
			System.out.println(rem*rem);
			n = n /10;	
		}
		sc.close();
	}
}
