package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program_2 {

	public static void main(String[] args) {
	
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("Tv", 900.0));
		set.add(new Product("Notebook", 1200.0));// OBJ 1 
		set.add(new Product("Tablet", 400.));
		
		Product prod = new Product("Notebook", 1200.0); // OBJ 2
		
		System.out.println(set.contains(prod));//testa a referência do OBJ pelo ponteiro, sua referencia do Heap.

	}

}
