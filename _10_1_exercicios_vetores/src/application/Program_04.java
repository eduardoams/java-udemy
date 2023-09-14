package application;

import java.util.Scanner;

public class Program_04 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 * Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/numeros_pares.java
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print("Digite um número: ");
			int number = sc.nextInt();
			numbers[i] = number;
			
		}
		
		int quantityPairs = 0;

		System.out.println();
		System.out.println("NÚMEROS PARES:");
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] % 2 == 0) {
				
				System.out.printf("%d ", numbers[i]);
				quantityPairs++;
				
			}
			
		}
		
		System.out.printf("\n\n");
		System.out.println("QUANTIDADE DE PARES = " + quantityPairs);
		
		
		sc.close();
		
	}

}
