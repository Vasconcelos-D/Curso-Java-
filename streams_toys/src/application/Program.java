package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main (String[] args) {
		//Criando uma lista de interios, como fonte de dados
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x *10);// Apliquei o .map( que aplica uma função a cada elemento da Stream)
		//Criando uma Stream, apartir de uma lista.
		System.out.println(Arrays.toString(st1.toArray()));// (toArray) converte a strings em vetor.
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");	// Vai gerar uma strem de vetor com uma lista de Strings. NOMES em uma LISTA
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x +2); // Função de GERAÇÃO. Potencialmente infinita. Por sempre add mais 2.
		System.out.println(Arrays.toString(st3.limit(10).toArray()));// Usando a função, limit(); ela me dar uma lista ate o limite parametrizado.
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0] + p[1]}).map(p -> p[0]);// Essa Stream, vai gerar uma sequência de fibronaci
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
	}
}
