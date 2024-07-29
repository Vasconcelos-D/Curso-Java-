package listas;
// Lista no Java.
//Ele é homogênia, e possuim dados do mesmo tipo...
//Sempre vai inicar vazia.
// tipo Interface, Classes que implementam: ArraayList, linkedList etc.
// Vantagens...
//Tamanho da Variavel, facilidade para ser realizar as delegações
//Desvantagens,acesso sequencial nos elementos*.

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Usando a List. ela tem que usar a RapClass.
		//ela deve ser instanciada.
		//Classes são usada para implementar as interfaces.
		List <String> list = new ArrayList<>();// Aqui a lista está sendo instaciada.
		// atraves .dd foi adicionada valor a lista.
		list.add("Maria");//
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		// usando esse recurso. ele vai ser add na posição 2 e não atera nada na lista.
		// para inserir um elemtno na posição [2] do elemento.
		list.add(2, "Marco");
	
		// Para ver o tamanho da lista usad o recurso ( .size() )
		System.out.println(list.size());
		
		//list.remove(1);
		// Para remover, usa o recurso. list.remove()
		// Pode ser removida por comparação no nome do elemento detro da lista ex("Ana") ou posição [0].
		
		
		// para inserir um elemtno na posição [2] do elemento.
		
		for(String x : list)
		//for each, é uma forma mas resumida para o laço for.
		{
			System.out.println(x);
			// fazendo a impressão na tela do valor da lista.
		}
		System.out.println("----------------------------------------------");
		
		//Removendo um elemento da lista através de um predicado.
		// Pode usar PREDICADO, para remover uma situação especifica. Ex todos que comocem com a letra M.
		list.removeIf(x -> x.charAt(0)== 'M');
		
		for(String x : list)
			{
				System.out.println(x);
				// fazendo a impressão na tela do valor da lista.
			}
		System.out.println("----------------------------------------------");
		//Encontrar a poisção de um elemento (list.indexOf)
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("----------------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		// Atraves deste predicado, imprimir na tela dodos os nomes que comecem com a letra Ex 'A' 
		for(String x : result)
		{
			System.out.println(x);
			// fazendo a impressão na tela do valor da lista.
		}
		System.out.println("----------------------------------------------");
		//Comando pra encontrar o o primeiro elemento usando predicado.
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		// Caso o elemento não esteja na lista, ele retorna null.
		
		
		
		
		sc.close();
	}
}
