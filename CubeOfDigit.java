package com.tka.basic;

import java.util.Scanner;

public class CubeOfDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		while(n>0) {
			int rem= n % 10;
			System.out.println(rem*rem*rem);
			n = n /10;
		}
		sc.close();
	}
}
