import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo, qtde;
		double total;
		
		System.out.println("Entrada:");
		
		codigo = sc.nextInt();
		qtde = sc.nextInt();
		
		if (codigo == 1) {
			total = 4.00 * qtde;
		} else if (codigo == 2) {
			total = 4.50 * qtde;
		} else if (codigo == 3) {
			total = 5.00 * qtde;
		} else if (codigo == 4) {
			total = 2.00 * qtde;
		} else {
			total = 1.50 * qtde;
		}
				
		System.out.println("Saída:");
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
		
	}

}
