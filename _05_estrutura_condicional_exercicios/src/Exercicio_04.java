import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		int inicio, fim, duracao, dia = 24;
		
		System.out.println("Entrada:");
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (fim <= inicio) {
			duracao = dia - inicio + fim;
		} else {
			duracao = fim - inicio;
		}
		
		System.out.println("Saída:");
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		
	}

}
