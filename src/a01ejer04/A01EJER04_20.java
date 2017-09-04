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
public class A01EJER04_20 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter a string

		System.out.print("Enter a sting: ");

		String str = input.nextLine();



		// Display the string's length and its first character

		System.out.println(str + " has a length of " + str.length() +

			" and its first character is " + str.charAt(0));

	}
}
