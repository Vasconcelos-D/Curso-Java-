package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program_2 {

	public static void main(String[] args) {
	
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("Tv", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.));
		// faz a comparação usando o COMPARABLE como implements da classe.
		for (Product p : set) {
			System.out.println(p);
		}
	}
}
