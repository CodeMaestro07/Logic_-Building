package com.tka.String.pradeepsir;

public class RevString {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println("original s : " + s);
		char a[] = s.toCharArray();
		char rev[] = new char[a.length];
		for (int i = a.length - 1, k = 0; i >= 0; i--)
			rev[k] = a[i];

		for (int p = 0; p < rev.length; p++) {
			System.out.println(rev[p]);
		}
		System.out.println("After s :" + s);

	}
}
