package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler os dados de uma conta bancária e depois realizar
		 * um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode
		 * ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior
		 * ao limite de saque da conta. Implemente a conta bancária conforme projeto
		 * abaixo:
		 * 
		 * https://i.imgur.com/MBBmWQ6.png https://github.com/acenelio/exceptions2-java/
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		try {
		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.println(account.getBalance());
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
		
		} catch (BusinessException e) {
			System.out.println("Withdraw error: " + e.getMessage());	
		}
		
		sc.close();
	
	}

}
