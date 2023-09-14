package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.print("Name: ");
		e.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		e.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + e);
		
		System.out.println();
		System.out.print("Which porcentage to increase salary? ");
		e.increaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + e);
		
		sc.close();
		
	}

}
