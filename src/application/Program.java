package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	
	void main() {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		IO.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			IO.println("\u001B[1mProduct #" + i + " data: \u001B[0m");
			IO.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			IO.print("Name: ");
			String name = sc.nextLine();
			IO.print("Price: ");
			double price = sc.nextDouble();
			
			if (ch == 'i') {
				IO.print("Customs fee: ");
				double customsFee = sc.nextDouble(); 
				list.add(new ImportedProduct(name, price, customsFee));
			} else if (ch == 'u') {
				IO.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt);
				list.add(new UsedProduct(name, price, manufactureDate));
			}else {
				list.add(new Product(name, price));
			}
		}
		
		IO.println();
		IO.println("PRICE TAGS: ");
		for (Product p : list) {
			IO.println(p.priceTag());
			
		sc.close();
		}
		
	}

}
