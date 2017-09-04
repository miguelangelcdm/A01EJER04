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
public class A01EJER04_05 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter the number of sides  

		// and their length of a regular polygon

		System.out.print("Enter the number of sides: ");

		int numberOfSides = input.nextInt();

		System.out.print("Enter the side: ");

		double side = input.nextDouble();



		// Compute the area of a regular polygon

		double area = (numberOfSides * Math.pow(side, 2) / 

			(4 * Math.tan(Math.PI / numberOfSides)));



		// Display result

		System.out.println("The area of the polygon is " + area);

	}
}
