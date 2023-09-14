import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {

		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com um mensagem explicativa, conforme exemplos.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int x, y, soma;
		
		System.out.println("Entrada:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("Saída:");
		System.out.printf("SOMA = %d\n", soma);
		
		sc.close();
		
	}

}
