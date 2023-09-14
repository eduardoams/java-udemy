import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Entrada:");
		
		N = sc.nextInt();
		
		System.out.println("Saída:");
		
		if (N % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		
		sc.close();
	}

}
