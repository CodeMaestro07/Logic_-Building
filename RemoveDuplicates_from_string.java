package com.tka.Logical.prog;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_from_string {
	public static void main(String[] args) {
        String input = "chaai";

        String result = removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        // Create a set to store unique characters
        Set<Character> set = new LinkedHashSet<>();

        // Loop through the string and add each character to the set
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }
}
