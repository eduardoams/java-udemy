package application;

import java.util.Locale;
import java.util.Scanner;

import models.services.BrazilInterestService;
import models.services.InterestService;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler uma quantia e a duração em meses de um empréstimo.
		 * Informar o valor a ser pago depois de decorrido o prazo do empréstimo,
		 * conforme regras de juros do Brasil. A regra de cálculo de juros do Brasil é
		 * juro composto padrão de 2% ao mês.
		 * https://github.com/acenelio/interfaces5-java/
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		System.out.print("Interest rate: ");
		double interestRate = sc.nextDouble();
		
		System.out.println("Payment after " + months + " months: ");
		InterestService interest = new BrazilInterestService(interestRate);
		System.out.println(String.format("%.2f", interest.payment(amount, months)));
		
	}

}
