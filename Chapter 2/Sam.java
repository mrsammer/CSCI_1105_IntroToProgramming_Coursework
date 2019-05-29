/*
Author: Samuel Jones
Date: 5/28/19

This program shows how much money you would spend on gas going 900.5 miles getting 25.5 miles per gallon of gas and paying 3.55 for a gallon of gas
*/

import java.util.Scanner;

class Sam {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double Pricepergallon = 0.0;
		double Milespergallon = 0.0;
		double Milesdriven = 0.0;
	
		System.out.print("Enter Price Per Gallon ");
		Pricepergallon = input.nextDouble();
		System.out.print("Enter Miles Per Gallon ");
		Milespergallon = input.nextDouble();
		System.out.print("Enter Miles Driven ");
		Milesdriven = input.nextDouble();
		
		Milesdriven = (Milesdriven / Milespergallon) * Pricepergallon;
		System.out.println("You will spend $" + Milesdriven);
		
		
		
		
				
		}
}