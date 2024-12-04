package com.logic.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayAscending {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int size = y.nextInt();

		int[] a = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			a[i] = y.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Array in ascending order is:");
		for (int x : a) {
			System.out.println(x + " ");

		}
	}

}
