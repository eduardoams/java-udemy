import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
		X, se for o caso.*/
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();		
		
		for (int i = 1; i < X ; i++) {
			 
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
		}
		 
		sc.close();
		
	}

}
