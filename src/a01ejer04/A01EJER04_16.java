/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01ejer04;
/**
 *
 * @author MAGD7-PC
 */
public class A01EJER04_16 {
    public static void main(String[] args) {

		// Generate a random number between 65 and 90

		int number = 65 + (int)(Math.random() * (91 - 65));



		// Display a random uppercase letter

		System.out.println((char)(number));

	}
}
