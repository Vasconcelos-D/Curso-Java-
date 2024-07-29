package data_hora_java2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Programa de Data e hora, com a norma ISO.
public class Main 
{
	public static void main(String[] args)
	{
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("DateTimeFormatter: " + d04.format(ftm1));
		System.out.println("DateTimeFormatter: " + ftm1.format(d04));
		//Esssas são duas formas de usar o metodo (Var.format(var)) um pasando o ftm1 criado no DateTimeFormatter.
		//Ou usando  o (var.format(Var))
		

	}

}
