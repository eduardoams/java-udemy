package application;

import java.util.Locale;
import java.util.Scanner;

import models.services.BrazilInterestService;

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
		Double amount = sc.nextDouble();
		System.out.print("Months: ");
		Integer months = sc.nextInt();
		System.out.println("Payment after " + months + " months: ");
		BrazilInterestService interest = new BrazilInterestService(2.0);
		System.out.println(String.format("%.2f", interest.payment(amount, months)));
		
	}

}
