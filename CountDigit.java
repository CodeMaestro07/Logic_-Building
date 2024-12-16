package com.tka.basic;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();

		int count=0;
		
		while(n>0) {
			
			 count= count+1;
			 n = n /10;
		}
		System.out.println("Digits in a number ="+" "+count);
		sc.close();
	}
}
