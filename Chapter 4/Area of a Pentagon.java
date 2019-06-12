/*
Author:Samuel Jones
Date:6/6/19

This progam shows the output of a pentagon
*/

import java.util.Scanner;
import java.math.*;


class AreaofaPentagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the center to the vertex: ");
		double vertex = input.nextDouble();
		double s = Math.sin(Math.PI / 5) * 2 * vertex;
		System.out.print("The area of the pentagon is " + (5 * (Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5)))));
				
		
		
	}
}