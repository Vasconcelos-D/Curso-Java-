package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program_exer {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter of path:");// ENTRADA DE DADOS, PELO CAMINHO DO ARQUIVO
		String path = sc.nextLine();// LAZ A LEITURA PELO SCANNER
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			// ABRINDO O ARQUIVO
			// BLOCO TRY, PARA TRATAR AS EXCEÇÕES.
			// COMO ARGUMENTO CHAMA, O BUFFEREDREAD, ATRIBUINDO A UMA VAR E INSTACIAR UM OBEJTO BUFFEREDREAD  
			//COMO ARGUMENTO INSTANCIA OUTRO OBJ FILEREAD QUE PASSA COMO ARGUMENTO O CAMINHO PATH.
			
			List<Product> list = new ArrayList<>(); // INTANCIA UMA NOVA LISTA DE PRODUTO.
			
			String line = br.readLine(); // CRIA UMA VAR STR, QUE VAI REBER A LEITURA DA VAR BR DO BUFF, LENDO LINHA POR LINDA.
			while (line != null) {
				// VAI TESTA A CONDIÇÃO PARA LER E RECORTAR CADA LINHA DO ARQUIVO E ARMAZENAR NO OBJETO PRODUCT
				String[]  fildes = line.split(",");// RECORTA O STRING EM 2, SEPARAR NOME E PRECO
				list.add(new Product(fildes[0], Double.parseDouble(fildes[1]))); // FAZ A INSTACIA DO PRODUTO, ATRIBUINDO OS VALORES RECORTADOS.
				line = br.readLine();
			}
			
			Double avg = list.stream()// CRIOU UM VAR PARA MEDIA
					.map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y) / list.size();// FEZ O SOMATORIO E CALCULO DA MEDIA.
			System.out.println("Avarege price: " + String.format("%.2f", avg));//IMPRIME NO PROMPT MEDIA. 
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());//FUNÇÃO PARA COMPARAR OS STRINGS ABAIXO DA MEDIA
					
			List<String> names = list.stream() // NOVA LIST DE STREAM USANDO PIPILENE
					.filter(p -> p.getPrice() < avg)// TESTA QUE TODO PRECO MENOR QUE A MEDIA FILTER.
					.map(p -> p.getName())// PEGA O NOME DE CADA PRODUTO
					.sorted(comp.reversed())//ORDENADO  A STREAM EM ORDEM DESCRESENTE
					.collect(Collectors.toList());//CONVERTE EM STREM EM STRING
			names.forEach(System.out::println);
		}
		catch (IOException e) {
			System.out.println("Error" + e.getMessage());// LANCA UMA EXCEÇÃO.
		}
		
		sc.close();
	}
}
