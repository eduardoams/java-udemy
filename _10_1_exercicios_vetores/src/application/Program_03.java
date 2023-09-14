package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program_03 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 * Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] people = new Person[n];
		
		for (int i = 0; i < people.length; i++) {
			
			System.out.println(i + 1 + "st person data:");
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			people[i] = new Person(name, age, height);
			
		}
		
		double heightAvg = 0.0;
		int smaller16 = 0;
		
		for (int i = 0; i < people.length; i++) {
			heightAvg += people[i].getHeight();
		}
		
		System.out.printf("Average height: %.2f\n", heightAvg / people.length);
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].getAge() < 16) System.out.println(people[i].getName());
		}
		
		sc.close();
		
	}

}
