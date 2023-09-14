package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		/*
		 * HashSet
		 * Mais rápido (operações O(1) em tabela hash) e não ordenado
		 */
		Set<String> set = new HashSet<>();
		
		set.add("Moreira");
		set.add("Augusto");
		set.add("Eduardo");
		
		System.out.println(set.contains("Eduardo"));
		
		set.forEach(s -> System.out.println(s));
		
	}

}
