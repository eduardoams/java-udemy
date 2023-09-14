import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Entrada:");
		
		N = sc.nextInt();
		
		System.out.println("Saída:");
		
		if (N >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
		
	}

}
