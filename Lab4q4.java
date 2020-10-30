package Lab4q4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4q4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = 0;
		try {

			do {
				System.out.println("Please enter a number or -1 to quit");
				number = scanner.nextInt();
				evenOdd(number);
			} while (number != -1);
			
			
		} catch (InputMismatchException e) {
			System.out.println("you must enter an integer");
		}
		
	}

	private static void evenOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("even");
		} else if(number%2!=0){
			System.out.println("odd");
		} else {
			System.exit(0);
		}
	}
}