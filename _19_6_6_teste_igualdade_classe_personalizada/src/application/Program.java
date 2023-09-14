package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		/*
		 * Como as coleções Hash testam igualdade? Se hashCode e equals estiverem
		 * implementados: Primeiro hashcode. Se der igual, usa equals para confirmar Se
		 * hashCode e quals NÃO estiverem implementados na classe: Compara as
		 * referências (ponteiros - instanciação) dos objetos
		 */
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
		
	}

}
