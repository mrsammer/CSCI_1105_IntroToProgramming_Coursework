/*
Author:Samuel Jones
Date:5/23/19

This program solves Cramers rule
*/
class Cramersrule {
	public static void main(String[] args) {
		System.out.println("The veriable x comes out to " + (44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1));
		System.out.println("The veriable y comes out to " + (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 3.4));
		System.out.println("1=" + (3.4 * 2.623901496861419) + (50.2 * 0.4347491262365734));
		System.out.println("2=" + (2.1 * 2.623901496861419) + (0.55 * 0.4347491262365734));
		}
}