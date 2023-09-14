package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		/*
		 * LinkedHashSet
		 * velocidade intermediária e elementos
		 * na ordem em que são adicionados
		 */
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Moreira");
		set.add("Augusto");
		set.add("Eduardo");
		
		System.out.println(set.contains("Eduardo"));
		
		set.forEach(s -> System.out.println(s));
		
	}

}
