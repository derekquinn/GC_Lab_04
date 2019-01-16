package gC_lab04;

import java.util.Scanner;

public class gC_lab04_01 {

	public static void main(String[] args) {
		int userInput;
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			System.out.println("Please enter an integer to do some math with.");

			Scanner scnr = new Scanner(System.in);
			userInput = scnr.nextInt();

			System.out.println("Number\tSquared\tCubed");
			System.out.println("======\t=======\t=====");

			for (int i=1; i <= userInput; i++) {
				System.out.print(i);
				System.out.print("\t");
				System.out.print(i * i);
				System.out.print("\t");
				System.out.println(i * i * i);

			}
			
			System.out.println("\n");
			System.out.println("To continue press Y. To quit, press any other key.");
			choice = scnr.next();
			// System.out.println(userInput);

		}
	}
}