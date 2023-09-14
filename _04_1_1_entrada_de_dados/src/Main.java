import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Ler string
		String x;
		System.out.print("Informe uma string: ");
		x = sc.next();
		System.out.println("Você digitou a string: " + x);
		System.out.println();

		// Ler inteiro
		int y;
		System.out.print("Informe um inteiro: ");
		y = sc.nextInt();
		System.out.println("Você digitou o inteiro: " + y);
		System.out.println();

		// Ler flutuante
		double z;
		System.out.print("Informe um flutuante: ");
		z = sc.nextDouble();
		System.out.println("Você digitou o flutuante: " + z);
		System.out.println();

		// Ler um caractere
		char w;
		System.out.print("Informe um caractere: ");
		w = sc.next().charAt(0);
		System.out.println("Você digitou o char: " + w);
		System.out.println();

		// Ler vários dados em uma só linha (separados por espaço)
		String dado1;
		int dado2;
		double dado3;

		System.out.print("Informe uma string, um inteiro e um flutuante, em sequência separados por um espaço: ");
		dado1 = sc.next();
		dado2 = sc.nextInt();
		dado3 = sc.nextDouble();

		System.out.println("Dados digitados:");
		System.out.println(dado1);
		System.out.println(dado2);
		System.out.println(dado3);
		System.out.println();

		// Ler um texto até a quebra de linha
		String s1, s2, s3;
		
		System.out.print("Informe três textos em sequência e digite ENTER: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
