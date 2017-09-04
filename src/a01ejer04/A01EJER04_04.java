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
public class A01EJER04_04 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter the side of a hexagon

		System.out.print("Enter the side: ");

		double s = input.nextDouble();



		// Compute the area of a hexagon

		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));



		// Display result

		System.out.printf("The are of the hexagon is %4.2f\n", area);

	}
}
