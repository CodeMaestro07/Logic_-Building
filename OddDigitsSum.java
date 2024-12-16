package com.tka.basic;

import java.util.Scanner;

public class OddDigitsSum {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n= sc.nextInt();
		
		int rem=0;
		int sum=0;
		
		while(n>0) {
			
			rem = n % 10;
			n = n /10;

			if(rem % 2==1) {
				sum=sum+rem;
			}
		}
		System.out.println("Sum of odd digits ="+" "+sum);
		sc.close();
	}
}
