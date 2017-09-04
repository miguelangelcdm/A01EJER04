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
public class A01EJER04_21 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter a Social Security number

		System.out.print("Enter a SSN: ");

		String ssn = input.nextLine();



		// Check whether the input is valid

		boolean isValid = 

			(ssn.length() == 11) && 

			(Character.isDigit(ssn.charAt(0))) &&

			(Character.isDigit(ssn.charAt(1))) &&

			(Character.isDigit(ssn.charAt(2))) &&

			(ssn.charAt(3) == '-') &&

			(Character.isDigit(ssn.charAt(4))) &&

			(Character.isDigit(ssn.charAt(5))) &&

			(Character.isDigit(ssn.charAt(7))) &&

			(ssn.charAt(6) == '-') &&

			(Character.isDigit(ssn.charAt(8))) &&

			(Character.isDigit(ssn.charAt(9))) &&

			(Character.isDigit(ssn.charAt(10)));



		// Display result

		System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")

			+ "social security number");

	}
}
