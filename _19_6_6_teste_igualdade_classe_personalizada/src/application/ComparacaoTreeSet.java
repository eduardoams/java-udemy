package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class ComparacaoTreeSet {

	public static void main(String[] args) {

		/*
		 * ORDENANDO POR NOME
		 * Com Treeset a classe do conjunto tem que ser uma implementação do Comparable
		 * para ser possível ordenar os objetos
		 */
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		set.forEach(s -> System.out.println(s));
		
	}

}
