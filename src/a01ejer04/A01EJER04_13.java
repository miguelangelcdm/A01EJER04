/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01ejer04;
import java.util.Scanner;
/**
 *
 * @author MAGD7-PC
 */
public class A01EJER04_13 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter a letter

		System.out.print("Enter a letter: ");

		String s = input.nextLine();

		char ch = s.charAt(0);



		if (Character.isLetter(ch))

		{

			switch(Character.toUpperCase(ch))

			{

				case 'A': 

				case 'E': 

				case 'I': 

				case '0': 

				case 'U': System.out.println(ch + " is a vowel"); break;

				default : System.out.println(ch + " is a consonant"); 

			}

		}

		else

			System.out.println(ch + " is an invalid input");

	}
}
