/* 
Author: Samuel Jones 
Date: 9/4/19

This program shows the number divisible by five ad six from 100 to 200
*/

import java.util.Scanner;

class numberRange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int countFive = 100;
		int countSix = 100;
		int counter = 1;
		System.out.println("Counting from 100-200");
		System.out.println("Divisible by 5 or 6, but not 5 and 6 \n");
		
		for(countFive = 100; countFive <= 200; countFive += 1) {
			if (countFive % 5 == 0 ^ countFive % 6 == 0) {
					System.out.print(countFive + " ");
					counter++;
				}
			if (counter > 10) {
				System.out.print("\n");
				counter = 1;
				
			}
		}
	}
}
