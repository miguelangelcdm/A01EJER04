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
public class A01EJER04_26 {
    public static void main(String[] args) {

		// Create a Scanner

		Scanner input = new Scanner(System.in);



		// Receive the amount

		System.out.print("Enter an amount, for example 11.56: ");

		String amount = input.nextLine();



		// Extract number of dollars

		String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));



		// Extract cents

		int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));



		// Find the number of quarters

		int numberOfQuarters = cents / 25;

		cents %= 25;



		// Find the number of dimes

		int numberOfDimes = cents / 10;

		cents %= 10;



		// Find the number of nickels

		int numberOfNickels = cents / 5;

		cents %= 5;



		// Display results

		System.out.println("Your amount " + amount + " consists of\n " 

			+ numberOfOneDollars + " dollars\n " 

			+ numberOfQuarters + " quarters\n "

			+ numberOfDimes + " dimes\n "

			+ numberOfNickels + " nickels\n "

			+ cents + " pennies\n "

			);

	}
}
