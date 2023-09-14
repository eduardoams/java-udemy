package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
				
		/*
		 * Método utiliza interface funcional Consumer, onde apenas um método
		 * abstrato é implementado
		 * 
		 * Métodos estáticos não mexem com o próprio objeto, e sim com o objeto
		 * recebido como parâmetro
		 * 
		 * https://github.com/acenelio/lambda3-java
		 */
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		//Acrescentando 10% do valor utilizando método estático
//		list.forEach(Product::staticPriceUpdate);
		
		//Acrescentando 10% do valor utilizando método não estático
		list.forEach(Product::nonStaticPriceUpdate);
		
		list.forEach(System.out::println);
		
	}

}
