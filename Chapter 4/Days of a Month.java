/*
Author: Samuel Jones
Date: 6/10/19

This program displays the days in a month
*/

import java.util.Scanner;
import java.math.*;


class DaysofaMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		double year = input.nextDouble();
		System.out.print("Enter the first three letters of a month: ");
		String month = input.next().toLowerCase();
		
		if (month.equals("jan")) {
			System.out.print(month + " has 31 days");
		}
		
		if (month.equals("feb")) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					System.out.println("Feb is a leap year with 29 days");
			}
			else {
					System.out.print("Feb is not a leap year with 28 days ");
					}	
		}
			else if (month.equals("mar")) {
				System.out.print(month + " has 31 days");
		}
			else if (month.equals("apr")) {
				System.out.print(month + " has 30 days");
		}
			else if (month.equals("may")) {
				System.out.print(month + " has 31 days");
		}
			else if (month.equals("jun")) {
				System.out.print(month + " has 30 days");
		}
			else if (month.equals("jul")) {
				System.out.print(month + " has 31 days");
		}
			else if (month.equals("Aug")) {
				System.out.print(month + " has 31 days");
		}
			else if (month.equals("Sep")) {
				System.out.print(month + " has 30 days");
		}
			else if (month.equals("Oct")) {
				System.out.print(month + " has 30 days");
		}
			else if (month.equals("Nov")) {
				System.out.print(month + " has 30 days");
		}
			else if (month.equals("dec")) {
				System.out.print(month + " has 31 days");	
		}
		
		
	}
}