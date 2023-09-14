package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Tipos comuns (String, Date, Integer, Double etc) já possuem implementação
		 * para essas operações. Classes personalizadas (Client) precisam sobrepô-las
		 * Comparação de nome e e-mail
		 */

		Client c1 = new Client("Eduardo", "eduardo@gmail.com");
		Client c2 = new Client("Amanda", "amanda@gmail.com");
		
		System.out.println("c1 hashCode: " + c1.hashCode());
		System.out.println("c2 hashCode: " + c2.hashCode());
		System.out.println("c1 c2 equals: " + c1.equals(c2));
		
		System.out.println();
		
		Client c3 = new Client("Chloe", "chloe@gmail.com");
		Client c4 = new Client("Chloe", "chloe@gmail.com");
		
		System.out.println("c3 hashCode: " + c3.hashCode());
		System.out.println("c4 hashCode: " + c4.hashCode());
		System.out.println("c3 c4 equals: " + c3.equals(c4));
		
	}

}
