import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */
		
		int N = sc.nextInt(), X = 0, countIn = 0, countOut = 0;
		
		for (int i = 0; i < N; i++) {
			
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) countIn++;
			else countOut++;
							
		}
		
		System.out.println(countIn + " in");
		System.out.println(countOut + " out");
		
		sc.close();
		
	}
	
}
