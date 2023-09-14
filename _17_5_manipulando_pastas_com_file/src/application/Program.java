package application;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.next();
		
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		System.out.println();
		
		System.out.println("FILES:");
		File[] files = path.listFiles(File::isFile);
		for (File file : files) {
			System.out.println(file);
		}
		
		System.out.println();
		
		String subdir = "/subdir";
		boolean success = new File(strPath + subdir).mkdir();
		System.out.println("Directory '" + subdir + "' created successfully: " + success);
		
		sc.close();
		
	}

}
