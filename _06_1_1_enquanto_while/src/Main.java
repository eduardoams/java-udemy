import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Fazer um programa que lê números inteiros até que um zero seja lido. Ao final mostra a soma dos números lidos.
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), count = 0;
		
		while(n > 0) {
			count += n;
			n = sc.nextInt();
		}
		
		System.out.println(count);
		
		sc.close();
		
	}
	
}
