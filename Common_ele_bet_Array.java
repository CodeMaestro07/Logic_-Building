package com.tka.Logical.prog;

public class Common_ele_bet_Array {

	public static void main(String[] args) {
		int[] a = { 11, 23, 42, 70, 34, 23, 97 };
		int[] b = { 42, 56, 75, 23, 49, 23, 79 };
		System.out.println("Common_ele_bet_Array_Are:->");
		for (int y = 0; y < a.length; y++) {
			for (int s = 0; s < b.length; s++) {
				if (a[y] == b[s]) {
					System.out.print(a[y] + " ");
					break;
				}
			}
		}
	}

}
