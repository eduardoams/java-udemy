package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.printf("Tax payer #%d data:\n", i);
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new LegalPerson(name, annualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println("");
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		for (TaxPayer l : list) {
			System.out.println(l.getName() + ": $ " + String.format("%.2f", totalTaxes));
			totalTaxes += l.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", totalTaxes));
		
		sc.close();
		
	}

}
