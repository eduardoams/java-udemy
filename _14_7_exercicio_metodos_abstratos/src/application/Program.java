package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário),
		 * e depois mostrar as áreas destas figuras na mesma ordem em que foram
		 * digitadas.
		 * https://i.imgur.com/RWk43DD.png
		 * https://github.com/acenelio/inheritance7-java
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Shape #" + i + " data:");
			
			System.out.print("Rectangle or Cicle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			
			if (ch == 'r') {
				
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(Color.valueOf(color), width, height));
				
			}
			else {
				
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(Color.valueOf(color), radius));
				
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		list.forEach(s -> System.out.println(s.area()));			
		
	}

}
