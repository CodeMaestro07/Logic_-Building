package com.tka.basic;

// Print 1 to 10 and terminate loop at 5
public class Num {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
	}
}
