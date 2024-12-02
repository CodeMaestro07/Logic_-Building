package com.logic.pradeep.sir;

import java.util.Scanner;

public class WeekdayDisplay {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week (1 for Monday, 7 for Sunday):");
        int day = sc.nextInt();
        sc.close();
		String weekday ;
		switch (day) {
        case 1:
            weekday = "Monday";
            break;
        case 2:
        	weekday = "Tuesday";
            break;
        case 3:
            weekday = "Wednesday";
            break;
        case 4:
        	weekday = "Thursday";
        	break;
        case 5:
            weekday = "Friday";
            break;
        case 6:
            weekday = "Saturday";
            break;
        case 7 :
            weekday = "Sunday";
            break;
        default:
            weekday = "Invalid input. Please enter a number between 1 and 7.";
            break;
    }
		 System.out.println("The day of the week is: " + weekday);
		
	}

}
