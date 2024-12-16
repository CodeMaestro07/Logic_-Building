package com.tka.basic;

import java.util.Scanner;

public class MinDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n =sc.nextInt();
		
		int min=9;
		
		while(n>0) {
			
			int rem= n % 10;
			n= n /10;
			
			if(rem <min) {
				min=rem;
			}
		}
		System.out.println("Minimum digit ="+" "+min);
		sc.close();
	}
}
