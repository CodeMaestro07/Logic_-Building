package com.tka.basic;

import java.util.Scanner;

public class MaxDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n =sc.nextInt();
		
		int max=0;
		while(n>0) {
			
			int rem= n % 10;
			n = n /10;
			
			if(rem > max) {
				max=rem;
			}
		}
		System.out.println("Maximum digit ="+" "+max);
		sc.close();
	}
}
