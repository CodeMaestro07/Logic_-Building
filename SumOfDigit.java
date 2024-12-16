package com.tka.basic;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n =sc.nextInt();
		
		int rem=0;
		int sum=0;
		
		while(n>0) {
			rem = n % 10;
			sum = sum+rem;
			n = n / 10;
		}
		System.out.println(sum);
		sc.close();
	}
}
