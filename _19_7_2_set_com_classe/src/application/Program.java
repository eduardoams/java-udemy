package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/10/docs/api/java/util/Map.html
		
		Locale.setDefault(Locale.US);
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.00);
		Product p2 = new Product("Notebook", 1200.00);
		Product p3 = new Product("Tablet", 400.00);
		
		stock.put(p1, 10000.00);
		stock.put(p2, 20000.00);
		stock.put(p2, 15000.00);
		
		/*
		 * Para o map comparar um elemento de chave, utiliza hashCode e equals Caso não
		 * exista estas implementações, ele fará a comparação de ponteiros
		 */
		Product ps = new Product("Tv", 900.00);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		
	}

}
