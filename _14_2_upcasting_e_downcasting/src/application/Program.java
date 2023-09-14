package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Eduardo", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Amanda", 10.0, 500.0);
		
		// UPCASTING - Convertendo objeto de uma subclasse para uma variável da super classe
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Miriam", 0.0, 0.0);
		Account acc3 = new SavingsAccount(1004, "José", 0.0, 0.01);


		
		// DOWNCASTING - Convertendo objeto de uma super classe para uma variável da subclasse
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		// Não permitido, pois acc3 instancia SavingsAccount
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
