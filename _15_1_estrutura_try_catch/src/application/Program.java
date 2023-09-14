package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			//Alex Maria Bob
			String[] vect = sc.nextLine().split(" ");
			//5
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		}

		catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("End of program");

	}

}
