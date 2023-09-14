package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	
	public static void main(String[] args) {
		
		/* Fazer um programa para ler os valores de largura e altura de um retângulo.
		 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		System.out.println(r);
		
	}

}
