/*
Author: Samuel Jones
Date: 9/9/19

This program will display a triangle with each number 1-15 on the right and 15-1 on the left. 
*/


import java.util.Scanner;

class numberTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines in the triangle: ");
		
		int num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print("\n");
							
			for (int g = num - i; g >= 0; g -= 1) {
				System.out.printf("   ");	
			}
			for (int right = i; right >= 2; right--) {
				System.out.printf("%3d", right);
			}
				for (int left = 1; left <= i; left++) {
					System.out.printf("%3d", left);		
			}
		}
	}
}