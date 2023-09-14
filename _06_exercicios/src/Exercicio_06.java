import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			
			if (B == 0) System.out.println("Divisão Impossível");
			else System.out.println((double) A / B);
			
		}
		
		sc.close();
		
	}

}
