package application;
// Programa par ler umas lista do Diretorio e imprimir na tela, usando STREAMS
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program_exer_fix {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner(System.in);// INSTACIANDO O OBJ SCANNER
		
		System.out.print("Enter full file path: ");// SOLICITANDO ENTRADA DE DADOS
		String path = sc.nextLine();// ARMAZENDANDO OS DADOS NA VAR PATH: 
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){// INSTANCIANDO O OBJ PARA RECEBER E LER O CAMINHDO INSERIDO PELO SCANNER
			
			List<Employee> list = new ArrayList<>();// INSTANCOU UMA LISTA
			String line = br.readLine();// FUNÇÃO PARA LER CADA LINHA E ADD A VAR LINE
			
			while (line != null) {// CONDIÇÃO PARA LER CADA LINHA NO ARQUIVO
				String[] fields = line.split(",");// CRIANDO UM VETOR E RECORTALO SEPARANDO POR VIRGULA.
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");// SOLICTANDO DADOS
			double salary = sc.nextDouble();// ARMAZENANDO NA VAR SALARY:
			
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of employee whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum) );
			
		}
		catch(IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		
		
		sc.close();
	}
}
