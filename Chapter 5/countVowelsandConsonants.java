/*
Author: Samuel Jones
Date: 9/10/19

This program counts the number of vowels and consonants in a string of characters
*/

import java.util.Scanner;

class countVowelsandConsonants {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string of characters: ");
		String characters = input.nextLine();
		int countvowel = 0;
		int countcon = 0;
		
		for (int i = 0; i < characters.length(); i++) {
			char temp = Character.toUpperCase(characters.charAt(i));
			System.out.print(temp);
			if (temp == 'A' || temp == 'E' || temp == 'i' || temp == 'O' || temp == 'U') {
				countvowel++;
			}
			else if (Character.isLetter(temp)) {
				countcon++;
			}
		}
		System.out.print("\n");
		System.out.println("The number of vowels is " + countvowel);
		System.out.println("The number of consonants is " + countcon);		
		
		
	}
}
