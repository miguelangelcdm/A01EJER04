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
public class A01EJER04_25 {
    public static void main(String[] args) {

		// Generate three random uppercase letters

		int letter1 = 65 + (int)(Math.random() * (90 - 65));

		int letter2 = 65 + (int)(Math.random() * (90 - 65));

		int letter3 = 65 + (int)(Math.random() * (90 - 65));	



		// Generate four random digits

		int number1 = (int)(Math.random() * 10);

		int number2 = (int)(Math.random() * 10);

		int number3 = (int)(Math.random() * 10);

		int number4 = (int)(Math.random() * 10);



		// Display number plate

		System.out.println("" + (char)(letter1) + ((char)(letter2)) + 

			((char)(letter3)) + number1 + number2 + number3 + number4);

	}
}
