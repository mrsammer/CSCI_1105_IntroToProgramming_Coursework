/*
Author:Samuel Jones
Date:6/4/19

This program shows if a triangle is valid or invalid based on the lengths of two sides
*/


import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = input.nextDouble();
		System.out.print("Enter b: ");
		double b = input.nextDouble();
		System.out.print("Enter c: ");
		double c = input.nextDouble();
		
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Triangle is Valid " + (a + b + c));
		}
		else {
			System.out.println("Triangle is Invalid");
		}
	}
}