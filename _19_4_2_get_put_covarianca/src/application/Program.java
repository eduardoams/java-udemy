package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Contravariância: não é possível pegar elementos da lista (GET) quando a lista
		 * é do tipo Classe ou qualquer supertipo da Classe
		 * 
		 * get - ERROR
		 * put - OK
		 * 
		 * https://i.imgur.com/wxq2gH8.png
		 */

		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		
		//Number x = myNums.get(0);

	}

}
