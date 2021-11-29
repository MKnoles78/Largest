
//Mike Knoles 3.11 Midterm
//Largest.java
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// initialize variables to 0
		int counter = 0; // stores count
		int number = 0; // integer most recently input by user
		int largest = 0; // largest number found so far

		// prompt user for 10 integer values
		System.out.println("Please enter 10 integers: ");
		for (counter = 0; counter < 10; counter++) {
			number = input.nextInt();
			if (counter == 1) {
				largest = number;
			}
			// compares number on subsequent iterations against smallest
			else if (number > largest) {
				largest = number; // replaces largest if new number is largest
			}
		}
		System.out.printf("Largest Integer is: %d%n", largest);
	}
}
