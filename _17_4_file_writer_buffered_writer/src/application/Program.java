package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "/home/eduardo/Documentos/out.txt";
		String[] lines = new String[] {"Vai","Corinthians"};
		
		// Instanciando desta forma, o conteúdo será
		// acrescentado no arquivo new FileWriter(path, true);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
