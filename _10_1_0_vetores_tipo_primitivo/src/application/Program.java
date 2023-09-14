package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
		 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas
		 * pessoas.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double soma = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			double height = sc.nextDouble();
			vect[i] = height;
			soma += height;
		}
		
		System.out.printf("AVERAGE HEIGHT = %.2f", soma / n);
		
		sc.close();
		
	}

}
