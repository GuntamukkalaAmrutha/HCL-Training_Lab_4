package Lab4q5;

import java.util.Scanner;

public class Lab4q5{
	public static void main(String[] args) {
		try(Scanner scanner= new Scanner(System.in)) {
			System.out.println("Please enter a  number");
			int num = scanner.nextInt();
			try {
				if(num > 100) {
					throw new Exception();
				}
			}catch (Exception e) {
				System.out.println("Number can't be greater than 100");
			}
		}
	}
}