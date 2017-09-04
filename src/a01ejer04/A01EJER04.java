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
public class A01EJER04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
		// prompt the user to enter the length from  

		// the center of a pentagon to a vertex

		System.out.print("Enter the length from the center to a vertex: ");

		double r = input.nextDouble();



		// Compute the area of the pentagon

		double s = (2 * r) * Math.sin(Math.PI / 5); // Length of a side

		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

		// Display results

		System.out.printf("The area of the pentagon is %5.2f\n", area);
    }
    
}
