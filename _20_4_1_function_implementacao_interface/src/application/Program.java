package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {
	
	public static void main(String[] args) {
				
		/*
		 * Fazer um programa que, a partir de uma lista de produtos, gere uma
		 * nova lista contendo os nomes dos produtos em caixa alta.
		 * 
		 * Método utilizando interface funcional Function, que recebe como parâmetro
		 * o dado de entrada e o dado de saída
		 * 
		 * Para utilizar o método map() é necessário que a lista seja convertida para
		 * stream()
		 * 
		 * https://github.com/acenelio/lambda4-java
		 */
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
