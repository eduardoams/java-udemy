package application;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		/*
		 * TreeSet
		 * Mais lento (operações O(log(n)) em árvore rubro-negra)
		 * e ordenado pelo compareTo do objeto (ou Comparator)
		 */
		Set<String> set = new TreeSet<>();
		
		set.add("Moreira");
		set.add("Augusto");
		set.add("Eduardo");
		
		System.out.println(set.contains("Eduardo"));
		
		set.forEach(s -> System.out.println(s));
		
	}

}
