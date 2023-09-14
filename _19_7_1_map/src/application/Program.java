package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "eduardosouza");
		cookies.put("email", "eduardo@gmail.com");
		cookies.put("phone", "11952920696");
		
		//Remove elemento
		cookies.remove("email");
		//Sobrescreve elemento existente
		cookies.put("phone", "11959382097");
		//Validando se elemento existe
		System.out.println("Contains cookie 'phone': " + cookies.containsKey("phone"));
		//Obtendo valor de um map
		System.out.println("Phone number: " + cookies.get("phone"));
		//Obtendo tamanho do map
		System.out.println("Size: " + cookies.size());
		
		System.out.println("All Cookies:");
		for (String c : cookies.keySet()) System.out.println(c + ": " + cookies.get(c));
		
	}

}
