

public class Main {

	public static void main(String[] args) {

		String original = "eduardo abc AUGUSTO moreira abc DE SOUZA    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(8, 15);
		String s06 = original.replace("a", "x");
		int i = original.indexOf("bc");
		int f = original.lastIndexOf("bc");
		
		String s07 = "10,13,17";
		String[] vect = s07.split(",");
		String n1 = vect[0];
		String n2 = vect[1];
		String n3 = vect[2];
		
		System.out.println("Tudo minúsculo: |" + s01 + "|");
		System.out.println("Tudo maiúsculo: |" + s02 + "|");
		System.out.println("Sem espaçamento: |" + s03 + "|");
		System.out.println("Caractere posição 2 adiante: |" + s04 + "|");
		System.out.println("Caractere posição 7 a 13: |" + s05 + "|");
		System.out.println("Troca 'a' por 'x': |" + s06  + "|");
		
		System.out.println("Posição primeira ocorrência 'bc': " + i);
		System.out.println("Posição última ocorrência 'bc': " + f);
		
		System.out.println("Números: " + vect);
		System.out.println("Número 1: " + vect[0]);
		System.out.println("Número 2: " + vect[1]);
		System.out.println("Número 3: " + vect[2]);
		
	}

}
