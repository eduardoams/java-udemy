package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/* Fazer um programa para ler os dados de um produto em estoque
		 * (nome, preco e quantidade no estoque). Em seguida:
		 * - Mostrar os dados do produto (nome, preço, quantidade no estoque,
		 * valor total no estoque0
		 * - Realizar uma entrada no estoque e mostrar novamente os dados do produto
		 * - Realizar uma saída no estoque e mostrar novamente os dados do produto
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		p.name = sc.next();
		
		System.out.print("Price: ");
		p.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		p.quantity = sc.nextInt();
				
		System.out.println();
//		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f\n", p.name, p.price, p.quantity, p.totalValueInStock());
		System.out.println("Product data: " + p);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		p.addProducts(sc.nextInt());
		
		System.out.println();
//		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f\n", p.name, p.price, p.quantity, p.totalValueInStock());
		System.out.println("Updated data: " + p);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		p.removeProducts(sc.nextInt());
		
		System.out.println();
//		System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f", p.name, p.price, p.quantity, p.totalValueInStock());
		System.out.printf("Updated data: " + p);
		
		sc.close();
		
	}

}
