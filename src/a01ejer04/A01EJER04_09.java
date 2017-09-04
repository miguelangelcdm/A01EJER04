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
public class A01EJER04_09 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter a character

		System.out.print("Enter a character: ");

		String s = input.nextLine();

		char ch = s.charAt(0);



		// Display Unicode of character

		System.out.println((int)ch);

	}
}
