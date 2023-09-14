package _06_1_3_faça_enquanto_do_while;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
		 * digite "s", repetir o programa. 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		char repeticao;
		
		do {
			
			System.out.print("Digite a temperatura em Celsius: ");
			
			double celcius = sc.nextDouble();
			double fahrenheit = 9.0 * celcius / 5.0 + 32;
				
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", fahrenheit);	
				
			System.out.printf("Deseja repetir (s/n)? ");
			repeticao = sc.next().charAt(0);
			
		} while (repeticao == 's');		
		sc.close();
		
	}
	
}
