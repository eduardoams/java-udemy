package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		/*
		 * Fazer um método que copia os elementos de uma lista para uma outra lista que
		 * pode ser mais genérica que a primeira
		 */
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
		
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		
		source.forEach(number -> destiny.add(number));
		
	}
	
	public static void printList(List<?> list) {
		
		list.forEach(l -> System.out.print(l + " "));
		System.out.println();
		
	}

}
