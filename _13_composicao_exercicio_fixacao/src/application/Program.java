package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois,
		 * mostrar um sumário do pedido conforme exemplo (próxima página). Nota: o
		 * instante do pedido deve ser o instante do sistema: new Date()
		 * https://i.imgur.com/OuLv9cf.png
		 * https://github.com/acenelio/composition3-java/
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String pName = sc.next();
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int pQuantity = sc.nextInt();
			
			Product product = new Product(pName, pPrice);
			OrderItem item = new OrderItem(pQuantity, pPrice, product);
			order.addItem(item);
			
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
	}

}
