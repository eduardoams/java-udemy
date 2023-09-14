package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Na contagem de votos de uma eleição, são gerados vários registros de votação
		 * contendo o nome do candidato e a quantidade de votos (formato .csv) que ele
		 * obteve em uma urna de votação. Você deve fazer um programa para ler os
		 * registros de votação a partir de um arquivo, e daí gerar um relatório
		 * consolidado com os totais de cada candidato.
		 * https://github.com/acenelio/map1-java
		 * 
		 * Arquivo de entrada:
		 *  Alex Blue,15
			Maria Green,22
			Bob Brown,21
			Alex Blue,30
			Bob Brown,15
			Maria Green,27
			Maria Green,22
			Bob Brown,25
			Alex Blue,31
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			Map<String, Integer> map = new LinkedHashMap();
			
			while (line != null) {
				
				String[] fields = line.split(",");
				String candidate = fields[0];
				Integer numberOfVotes = Integer.parseInt(fields[1]);
				
				if (map.containsKey(candidate)) {
					
					int votes = map.get(candidate);
					map.put(candidate, votes + numberOfVotes);
					
				}
				else {
					
					map.put(candidate, numberOfVotes);
					
				}
				
				line = br.readLine();
				
			}
			
			for (String c : map.keySet()) System.out.println(c + ": " + map.get(c));
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
		
	}

}
