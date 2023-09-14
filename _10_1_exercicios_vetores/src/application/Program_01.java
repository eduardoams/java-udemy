package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 * Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/negativos.java
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
			
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] < 0) System.out.println(numbers[i]);
			
		}
		
		sc.close();
		
	}

}
