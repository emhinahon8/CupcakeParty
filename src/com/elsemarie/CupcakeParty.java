package com.elsemarie;

import java.util.Scanner;

/**
 * @author Elsemarie Hinahon
 * @date 02/09/2024
 * A program that determines how many cupcakes will be left over based on user input
 */

public class CupcakeParty {

	/**
	 * Main method
	 * @param args Command line args
	 */

	public static void main(String[] args) {
		// Ask user input for the number of regular cupcake boxes
		try (Scanner input1 = new Scanner(System.in)) {
			System.out.println("Enter the number of regular cupcake boxes: ");
			int reg = input1.nextInt();

			// Ask user input for the number of small cupcake boxes
			try (Scanner input2 = new Scanner(System.in)) {
				System.out.println("Enter the number of small cupcake boxes: ");
				int sml = input2.nextInt();
				
				// The total amount cupcakes inside both regular and small boxes given
				int cupcakeTotal = reg * 8 + sml * 3;
				
				// Calculation to get remaining cupcakes if each student only gets 1
				int cupcakeRemaining = cupcakeTotal - 28;
				
				// Prints the total number of cupcakes remaining if each student gets only 1
				System.out.println("Since there are 28 students, there will be " +
				cupcakeRemaining + " cupcakes remaining.");
				System.out.println(cupcakeRemaining);

				// Calculation to get remaining cupcakes if each student gets equal amount
				int cupcakeRemaining1 = cupcakeTotal % 8;
				
				// Prints the total number of cupcakes remaining if each students gets an equal amount
				System.out.println("If each of the 28 students get an equal amount " +
				cupcakeRemaining1 + " cupcakes remaining.");
				System.out.println(cupcakeRemaining1);
			}
		}
	}
}
