package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		//Inserir elementos
		nomes.add("Eduardo");
		nomes.add("Amanda");
		nomes.add("Isabela");
		nomes.add("Laura");
		
		//Inserir elemento em posição específica
		nomes.add(2, "Miriam");
		nomes.add(3, "Evandro");
		
		//Retornar tamanho da lista
		System.out.println("List size: " + nomes.size());
		
		System.out.printf("\nANTES DAS REMOÇÕES:\n\n");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.printf("\nPÓS REMOÇÕES:\n\n");
		
		//Remover dado a partir da comparação dos elementos
		nomes.remove("Laura");
		
		//Remover elemento em posição específica
		nomes.remove(1);
		
		//Remover por PREDICADO (função lambda, retorna true ou false)
		//*Remova todo elemento x tal que o primeiro caracter seja "I"*
		nomes.removeIf(x -> x.charAt(0) == 'I');
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.printf("\nIndex of Eduardo: " + nomes.indexOf("Eduardo"));
		System.out.printf("\nIndex of Laura: " + nomes.indexOf("Laura") + "\n\n");
		
		//Permite que seja feito operações de lambda com o tipo List, que é um tipo antigo
		//Primeiro converte para stream, faz a operação e depois converte novamente para lista
		List<String> result = nomes.stream().filter(x -> x.charAt(0) == 'E').toList();
		
		System.out.println("Nomes com inicial 'E':");
		for (String nome : result) {
			System.out.println(nome);
		}
		
		//Pega o primeiro elemento com a letra "E", caso não exista retorna "null"
		String nameFirstE = nomes.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
		System.out.println(nameFirstE);
		
	}

}
