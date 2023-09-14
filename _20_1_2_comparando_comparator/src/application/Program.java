package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Classe apartada responsável por realizar a comparação
		 * isolando a classe Product
		 */

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(new MyComparator());
		
		list.forEach(p -> System.out.println(p));
		
	}

}
