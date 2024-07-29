package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: " );
		
		System.out.print("Name: ");
		product.name = input.nextLine();
		
		System.out.print("Price: ");
		product.price = input.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = input.nextInt();
		
		System.out.println();
		System.out.print("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter number of products to be add in stock: " );
		int quantity = input.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.print("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter number of products to be removed in stock: " );
	    quantity = input.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		input.close();
	}
}
