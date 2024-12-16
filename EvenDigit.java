package com.tka.basic;

import java.util.Scanner;

public class EvenDigit {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n =sc.nextInt();
		
		int count=0;
		
		while(n>0) {
			
			int rem= n % 10;
			n = n /10;
			if(rem % 2==0) {
				count = count+1;
			}
		}
		System.out.println("Even digits in a number ="+" "+count);
		sc.close();
	}
}
