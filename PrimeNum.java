package com.tka.basic;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int n =sc.nextInt();
				
		if(n == 0 || n==1) {
			System.out.println(n+" "+"is not a prime number");
		} else {
			boolean flag=true;
			
			for(int i=2;i<=n/2;i++) {
				if(n % i ==0) {
					flag=false;
					break;
				} 
			}
			if(flag==true) {
				System.out.println(n+" "+"is a prime number");
			} else {
				System.out.println(n+" "+"is not a prime number");

			}
		}
		sc.close();
	}
}
