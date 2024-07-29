package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class main {

	public static void main(String[] args) {

		//Set<String> set = new HashSet<>();
		//HashSet, é o mais rapido, mas não garante a ordem.
		//Set<String> set = new TreeSet<>();
		//Ele segue a ordem.
		Set<String> set = new LinkedHashSet<>();
		//Mamtem a ordem na qual os elemento são inseridos
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
	
		//set.remove("Tablet");// remove item do conjuto.
		//set.removeIf(x -> x.charAt(0) == 'T');// remove usando um predicado, um filtro
		
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
