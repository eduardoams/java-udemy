package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de
		 * itens vendidos. Cada item possui um nome, preço unitário e quantidade,
		 * separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
		 * localizado em uma subpasta chamada "out" a partir da pasta original do
		 * arquivo de origem, contendo apenas o nome e o valor total para aquele item
		 * (preço unitário multiplicado pela quantidade), conforme exemplo.
		 * https://github.com/acenelio/files1-java
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("/home/eduardo/Documentos/out/summary.csv", true));
			
			String line = br.readLine();
			
			while (line != null) {
				
				String[] product = line.split(",");
				
				String name = product[0];
				Double value = Double.parseDouble(product[1]);
				Double quantity = Double.parseDouble(product[2]);
				Double valueTotal = value * quantity;
				
				bw.write(name + "," + valueTotal);
				System.out.println(name + "," + valueTotal);
				bw.newLine();
				
				line = br.readLine();
				
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
