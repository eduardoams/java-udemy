import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
	
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double salary;
		
		System.out.println("Entrada:");
		number = sc.nextInt();
		hours = sc.nextInt();
		salary = sc.nextDouble();
		
		System.out.println("Saída:");
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f", hours * salary);
		
		sc.close();
	}
	
}
