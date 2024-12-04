package com.tka.String.pradeepsir;

public class StringPallindrome {
	public static void main(String[] args) {
		String s = "four";
		char a[] = s.toCharArray();
		char rev[] = new char[a.length];
		for (int i = a.length - 1, k = 0; i >= 0; i--,k++) {
			rev[k] = a[i];
		}
		String revStr = new String(rev);
		if (s.equals(revStr))
			System.out.println(s + " is Pallindrome ");
		else
			System.out.println(s + " is not Pallindrome ");

	}

}
