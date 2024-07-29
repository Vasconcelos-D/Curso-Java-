package data_hora_java;
//Programa para instanciar DATA E HORA 
// Usando varios tipos de formatação
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// Programa para usar data e hora no JAVA
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Metodo, para formatar data
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//Metodo, para formatar hora
		
		
		LocalDate d01 = LocalDate.now();
		//Instaciado a variavel (d01) através do Objeto
		//LocalDate d01 = LocalDate.now(); NOW é a referência para agora.METODO
		// Data atual.
		
		LocalDateTime d02 = LocalDateTime.now();
		//Intançiação da Hora, através do cogigo (LocalDateTime) = (LocalDateTime.now)
		
		Instant d03 = Instant.now();
		// Esse aqui gera uma data hora, de tipo global.
		// Para usar na maquina no padrao usario local, precisar ser convertida.
		
		LocalDate d04 = LocalDate.parse("2023-03-16");
		// usa o cogio (Parse) para convert, uma String em hoara. <LocalDate.parse("2023-03-16");>
		//Por padrao vc pode usar o toString dentro do print e ele já ira converter para a ISO
		
		LocalDateTime d05 = LocalDateTime.parse("2023-03-17T00:00:00");
		//Foi feito mesmo uso do PARSE, mas com a hora.
		
		Instant d06 = Instant.parse("2023-03-17T00:19:00Z");
		Instant d07 = Instant.parse("2023-03-17T00:19:00-03:00");
		
		LocalDate d08 = LocalDate.parse("17/03/2023", fmt1);
		//Poderia ter trocado o FMT1 por todo o metodo.
		//LocalDateTime d09 = LocalDateTime.parse("17/03/2023 00:23", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	
		LocalDateTime d09 = LocalDateTime.parse("17/03/2023 00:23", fmt2);
		
		//Poderia ter trocado o FMT2 por todo o metodo.
		//LocalDateTime d09 = LocalDateTime.parse("17/03/2023 00:23", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d10 = LocalDate.of(2023, 03, 07);
		
		LocalDateTime d11 = LocalDateTime.of(2023, 03, 17, 00, 50);
		// Instacir através da chamada, dia, mes, ano e hora.
	
		System.out.println("LocalDate:  " + d01);
		System.out.println("LocalDateTime:  " + d02);
		System.out.println("Instant:  " + d03);
		System.out.println("LocalDate.parse:  " + d04);
		System.out.println("LocalDateTime.parse:  " + d05);
		System.out.println("Instant.parse (Glogal):  " + d06);
		System.out.println("Instant.parse (-fusoHorario):  " + d07);
		System.out.println("DateTimeFormate (Data)(dd/MM/yyyy):  " + d08);
		System.out.println("DateTimeFormate (hora).(dd/MM/yyyy HH:mm):  " + d09);
		System.out.println("LocalDateTime.of(Data):  " + d10);
		System.out.println("LocalDateTime.of(Data e Hora):  " + d11);
		 
		// Saida do programa vai ser a data atual..
		
		sc.close();
	}

}
