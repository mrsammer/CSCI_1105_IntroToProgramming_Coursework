/*
Author: Samuel Jones
Date: 5/28/19

This program shows how much money you would spend on gas going 900.5 miles getting 25.5 miles per gallon of gas and paying 3.55 for a gallon of gas
*/

import java.util.Scanner;

class Sam {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double PPG = 3.55;
		double MPG = 25.5;
		System.out.print("if you drive 900.5 miles you will spend $" + (900.5 / MPG) * PPG);
		
		
		
				
		}
}