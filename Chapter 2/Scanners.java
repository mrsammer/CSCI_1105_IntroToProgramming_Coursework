/*
Author: Samuel Jones
Date: 5/23/19

This program converts Celsius into Fahrenheit
*/

import java.util.Scanner;

class Sam {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter degree in Celsius ");
		double fahrenheit = input.nextDouble();
		double celsius = (9.0 / 5 * fahrenheit + 32);
		System.out.println(fahrenheit + " Celsius is " + celsius);
	}
}