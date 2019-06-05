/*
Author:Samuel Jones
Date:6/4/19

This program shows the x and y points in a rectangle
*/

import java.util.Scanner;
import java.math.*;

class PointinRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x: ");
		double x = input.nextDouble();
		System.out.print("Enter y: ");
		double y = input.nextDouble();
		if (Math.abs(x) <= 5 && Math.abs(y) <= 2.5) {
			System.out.println("Valid point inside the rectangle");
		
		}
		else {
			System.out.println("Not a valid point inside the rectangle");
		}
	}
}