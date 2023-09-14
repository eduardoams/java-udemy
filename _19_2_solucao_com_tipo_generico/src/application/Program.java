package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		/* NESTE EXEMPLO PERMITE REUSO DA CLASSE PRINTSERVICE
		 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
		 * inteiros. Ao final, imprima esses números de forma organizada conforme
		 * exemplo. Em seguida, informar qual foi o primeiro valor informado.
		 */

		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		Integer n = sc.nextInt();
		
		for (int i = 0; i < n; i++) ps.addValue(sc.nextInt());
		
		ps.print();
		
		Integer first = ps.first();
		
		System.out.println("First: " + first);
		
		sc.close();

	}

}
