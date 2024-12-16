package com.tka.basic;

//Print numbers from 44 to 22 and skip numbers divisible by 3

public class Num1 {
	public static void main(String[] args) {
		
		for(int i=44;i>=22;i--) {
			
			if(i % 3==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
