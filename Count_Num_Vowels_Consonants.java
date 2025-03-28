package com.tka.Logical.prog;

import java.util.Scanner;

public class Count_Num_Vowels_Consonants {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a string:-> ");
		String input = s.nextLine();

		int vowelCount = 0;
		int consonantCount = 0;

		input = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			}

			else if (ch >= 'a' && ch <= 'z') {
				consonantCount++;
			}
		}

		System.out.println("Number of vowels:-> " + vowelCount);
		System.out.println("Number of consonants:-> " + consonantCount);

		s.close();
	}

}
