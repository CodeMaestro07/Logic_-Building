package com.tka.Logical.prog;

import java.util.Scanner;

public class Max_Min_values_array {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

       
        int[] y = new int[5];


        System.out.println("Enter 5 elements of the array:");
        for (int i = 0; i < 5; i++) {
            y[i] = s.nextInt();
        }

       
        int max = y[0];
        int min = y[0];

        
        for (int i = 1; i < 5; i++) {
            if (y[i] > max) {
                max = y[i];
            }
            if (y[i] < min) {
                min = y[i];
            }
        }

       
        System.out.println("Maximum value in the array:-> " + max);
        System.out.println("Minimum value in the array:-> " + min);

        
        s.close();
	}

}
