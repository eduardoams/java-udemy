package _06_1_2_para_for;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Fazer um programa que lê um valor inteiro N e depois N números inteiros. Ao final, mostra a soma dos números lidos
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), soma = 0;
				
		for (int i = 0; i < N; i++) {
			
			int x = sc.nextInt();
			soma += x;
			
		}
		
		System.out.println(soma);
				
		sc.close();
		
	}

}
