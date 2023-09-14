package application;

public class Program {

	public static void main(String[] args) {

		/*
		 * Retorna um número inteiro representando um código gerado a partir das
		 * informações do objeto Se o hashcode de dois objetos for diferente, então os
		 * dois objetos são diferentes Se o código de dois objetos for igual, muito
		 * provavelmente os objetos são iguais (rápido, pode haver colisão)
		 */
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
	}

}
