import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, raio, pi = 3.14159;
		
		System.out.println("Entrada:");
		raio = sc.nextDouble();
		
		System.out.println("Saída:");
		System.out.printf("A = %.4f", pi * Math.pow(raio, 2.0));
		
		sc.close();
	}

}
