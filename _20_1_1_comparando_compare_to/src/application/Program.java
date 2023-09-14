package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Dessa forma a classe não fica fechada para alteração.
		 * Se o critério de alteração mudar, a clase Product
		 * terá de ser alterada
		 */

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		Collections.sort(list);
		
		list.forEach(p -> System.out.println(p));
		
	}

}
