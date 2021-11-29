
//Mike Knoles 3.11 Midterm
//Largest.java
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// create an array to store 10 integers
		int numbers[] = new int[10];
		int number = 0; // integer most recently input by user
		int largest = 0; // largest number found so far

		// prompt user for 10 integer values
		System.out.println("Please enter 10 integers: ");
		for (number = 0; number < numbers.length; number++) {
			numbers[number] = input.nextInt();
		}

	}

}
