package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_05 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero)
		 * Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/maior_posicao.java
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] numbers = new double[n];

		for (int i = 0; i < numbers.length; i++) {

			System.out.print("Digite um número: ");
			double number = sc.nextDouble();
			numbers[i] = number;

		}

		double highestValue = 0;
		int higherPosition = 0;

		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
			if (numbers[i] > highestValue) {
				
				System.out.println("entrou");
				highestValue = numbers[i];
				higherPosition = i;
				
			}

		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.2f\n", highestValue);
		System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", higherPosition);

		sc.close();

	}

}
