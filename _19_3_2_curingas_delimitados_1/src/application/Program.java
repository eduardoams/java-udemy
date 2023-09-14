package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	/*
	 * Lista pode ser de Shape ou de qualquer lista que seja um subtipo de Shape Com
	 * esta implementação é possível não só passar como argumento uma lista do tipo
	 * Circle, mas também percorrê-la dentro do laço for do tipo Shape. Tipo curinga
	 * delimitado
	 * 
	 * Entretanto, não é possível adicionar elementos na lista quando a lista é do tipo
	 * curinga delimitado (List<? extends Shape> list)
	 */
	public static double totalArea(List<? extends Shape> list) {
		//list.add(new Rectangle(3.0, 4.0)); não é possível
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}