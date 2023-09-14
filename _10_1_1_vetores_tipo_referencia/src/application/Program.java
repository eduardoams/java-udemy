package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro N e os dados (nome e preço)de N
		 * Produtos. Armazene os N em um vetor. Em seguida, mostrar o preço médio dos
		 * produtos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			
			String name = sc.next();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();
		}
		
		System.out.printf("AVERAGE PRICE = %.2f", sum / vect.length);
		
		sc.close();
		
	}
}
