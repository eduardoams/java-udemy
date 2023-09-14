import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		double valorUn1, valorUn2, valorPagar;
		
		System.out.println("Entrada:");

		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valorUn1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valorUn2 = sc.nextDouble();
		
		valorPagar = (valorUn1 * numero1) + (valorUn2 * numero2);
		
		System.out.println("Saída:");
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

		sc.close();
	}
	
}
