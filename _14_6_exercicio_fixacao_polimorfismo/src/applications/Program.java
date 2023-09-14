package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> p = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
						
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch (ch) {
			case 'u': {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				p.add(new UsedProduct(name, price, manufactureDate));
				break;
			}
			case 'i': {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				p.add(new ImportedProduct(name,  price, customsFee));
				break;
			}
			default:
				p.add(new Product(name, price));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product pList : p) {
			System.out.println(pList.priceTag());
		}
		
		sc.close();
		
	}

}
