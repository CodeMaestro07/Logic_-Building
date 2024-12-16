package com.tka.basic;

public class EachDigit {
	public static void main(String[] args) {
		
		int n =1234;
		int rem=0;
		
		while(n>0) {
			rem = n % 10;
			n = n /10;
			System.out.println(rem);

		}
	}
}
