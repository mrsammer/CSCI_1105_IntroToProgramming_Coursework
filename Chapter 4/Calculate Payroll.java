/*
Author:Samuel Jones
Date:6/11/19

This program calculates your paychecks net pay after taxes
*/

import java.util.Scanner;
import java.math.*;
import java.awt.*;


class Calculatepayroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.next().toLowerCase();
		System.out.print("Enter hours worked: ");
		double hoursworked = input.nextDouble();
		System.out.print("Enter the hours pay: ");
		double hourspay = input.nextDouble();
		System.out.print("Enter federal tax rate: ");
		double federaltax = input.nextDouble();
		System.out.print("Enter state tax rate: ");
		double statetax = input.nextDouble();
		double grosspay = (hoursworked * hourspay);
		
		System.out.printf("\n Gross Pay: $%4.2f", grosspay);
		System.out.printf("\n Net Pay: $%.2f", ((hourspay * hoursworked) - ((federaltax * grosspay) + (statetax * grosspay))));
		
		
	}
}