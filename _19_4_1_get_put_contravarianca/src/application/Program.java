package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Covariância: não é possível adicionar elementos a lista (PUT) quando a lista
		 * é do tipo Classe ou qualquer subclasse da Classe
		 * 
		 * get - OK
		 * put - error
		 * 
		 * https://i.imgur.com/wxq2gH8.png
		 */

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		//list.add(20);

	}

}
