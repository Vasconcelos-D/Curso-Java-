package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program_2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);// iniciando uma Strem list
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);// Apliquei o .map( que aplica uma função a cada elemento da Stream).(ISSO É UMA OPERAÇÃO INTERMEDIARRIA)
		System.out.println(Arrays.toString(st1.toArray()));// OPERAÇÃO TERMINAL
		
		int sum = list.stream().reduce(0, (x, y) -> x + y);// SOMATORIO, NEUTRO (COMEÇA COM 0) \\ NO PRODUTORIO (COMEÇA COM 0)
		System.out.println("Sum = " + sum);// SOMOU TODOS OS ELEMENTOS DA LISTA ACIMA! 
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		
		//GERANDO UM PIPILINE
		//USANDO UM FILTRO (FILTER)
		
		
		System.out.println(Arrays.toString(newList.toArray()));
	}
}
