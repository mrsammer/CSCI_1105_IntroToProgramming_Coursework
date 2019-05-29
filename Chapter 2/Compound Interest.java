/*
Author: Samuel Jones
Date: 5/27/19

This program shows savings of 5% over the course of 6 months
*/

import java.util.Scanner;

class Sam {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double month1 = 100 * (1 + 0.00417);
		System.out.println("Savings after month 1 " + month1);
		double month2 = (100 + month1) * (1 + 0.00417);
		System.out.println("Savings after month 2 " + month2);
		double month3 = (100 + month2) * (1 + 0.00417);
		System.out.println("Savings after month 3 " + month3);
		double month4 = (100 + month3) * (1 + 0.00417);
		System.out.println("Savings after month 4 " + month4);
		double month5 = (100 +  month4) * (1 + 0.00417);
		System.out.println("Savings after month 5 " + month5);
		double month6 = (100 + month5) * (1 + 0.00417);
		System.out.println("Savings after month 6 " + month6);
		
				
		}
}