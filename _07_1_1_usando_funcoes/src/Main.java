import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorNumero = maior(a, b, c);
		imprimirMaiorNumero(maiorNumero);
		
		sc.close();
		
	}
	
	public static int maior(int n1, int n2, int n3)
	{
		int maiorNumero;
		
		if (n1 > n2 && n1 > n3) {
			maiorNumero = n1;
		}
		else if (n2 > n3) {
			maiorNumero = n2;
		}
		else {
			maiorNumero = n3;
		}
		
		return maiorNumero;
	}
	
	public static void imprimirMaiorNumero(int maior)
	{
		System.out.println("O maior número é: " + maior);
	}

}
