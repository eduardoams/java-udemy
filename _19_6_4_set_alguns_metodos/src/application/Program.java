package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		//Métodos funcionam para os três tipos
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Moreira");
		set.add("Augusto");
		set.add("Eduardo");
		set.add("Silva");
		
		//set.remove("Augusto"); //Remove "Augusto"
		//set.removeIf(x -> x.length() == 5); //Remove "Silva"
		//set.removeIf(x -> x.charAt(6) == 'o'); //Remove "Augusto" e "Eduardo"
		
		set.forEach(s -> System.out.println(s));
		
	}

}
