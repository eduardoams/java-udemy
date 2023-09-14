package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		/*
		 * Em um portal de cursos online, cada usuário possui um código único,
		 * representado por um número inteiro. Cada instrutor do portal pode ter vários
		 * cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser.
		 * Assim, o número total de alunos de um instrutor não é simplesmente a soma dos
		 * alunos de todos os cursos que ele possui, pois pode haver alunos repetidos em
		 * mais de um curso. O instrutor Alex possui três cursos A, B e C, e deseja
		 * saber seu número total de alunos. Seu programa deve ler os alunos dos cursos
		 * A, B e C
		 * https://github.com/acenelio/set2-java
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		addId(set, sc, sc.nextInt());
		
		System.out.print("How many students for course B? ");
		addId(set, sc, sc.nextInt());
		
		System.out.print("How many students for course C? ");
		addId(set, sc, sc.nextInt());
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
		
	}
	
	public static void addId(Set<Integer> set, Scanner sc, int n) {
		
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			set.add(id);
		}
		
	}

}
