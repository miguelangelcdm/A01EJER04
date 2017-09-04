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
public class A01EJER04_08 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter an ASCII code

		// (an integer between 0 and 127)

		System.out.print("Enter an ASCII code: ");

		int i = input.nextInt();



		// Display ASCII code as character

		System.out.println((char)i);

	}
}
