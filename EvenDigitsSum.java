package com.tka.basic;

import java.util.Scanner;

public class EvenDigitsSum {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		
		int sum=0;
		int rem=0;
		
		while(n>0) {
			
			rem = n % 10;
			n = n /10;
			if(rem % 2==0) {
				sum = sum+rem;
			}
		}
		System.out.println("Sum of even digits ="+" "+sum);
		sc.close();
	}
}
