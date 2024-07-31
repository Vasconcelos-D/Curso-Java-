package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{
	//Exemplo de INTERFACE FUCIONAL <PQ TEM APENAS UM METODO IMPLEMENTADO>
	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	

}
