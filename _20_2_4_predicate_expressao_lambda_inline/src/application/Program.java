package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
				
		/*
		 * Método utiliza métodos referenciados estáticos e não estáticos
		 */
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		//Removendo produtos com preço superior ou igual a 100.00
		double min = 100.00;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		
		list.removeIf(pred);

		list.forEach(l -> System.out.println(l));
		
	}

}
