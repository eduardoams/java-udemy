package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * //Object não é um supertipo de Integer EM LISTA, por isso não é possível fazer
		 * //o upcasting
		 * 
		 * List<Object> myObjs = new ArrayList<Object>(); List<Integer> myInts= new
		 * ArrayList<Integer>();
		 * myObjs = myInts;
		 * 
		 * //Isso é possível, pois não é uma lista
		 * Object obj;
		 * Integer x = 10;
		 * obj = x;
		 */
		
		/*
		 * //List<?> é o supertipo de qualquer tipo de lista
		 * 
		 * List<?> myObjs = new ArrayList<Object>(); List<Integer> myInts = new
		 * ArrayList<Integer>(); myObjs = myInts;
		 */
		
		/*
		 * //O método printList funciona para qualquer tipo de lista devido ao tipo
		 * curinga <?>, //porém não é possível adicionar dados a uma coleção do tipo
		 * curinga List<Integer> myInts = Arrays.asList(5, 2, 10); printList(myInts);
		 * 
		 * List<String> myStrs = Arrays.asList("Maria", "Bob", "Alex");
		 * printList(myStrs);
		 */


	}
	
	public static void printList(List<?> list) {
		//list.add(3); não é possível 
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
