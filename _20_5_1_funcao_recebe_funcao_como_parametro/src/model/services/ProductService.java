package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		
		double sum = 0.0;
		
		for (Product l : list) {
			if (criteria.test(l)) {
				sum += l.getPrice();
			}
		}
		
		return sum;
	}

}
