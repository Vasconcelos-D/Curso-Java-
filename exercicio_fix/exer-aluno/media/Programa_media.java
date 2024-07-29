package media;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluno;

public class Programa_media
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Aluno estud = new Aluno();
		
		estud.nome = input.nextLine();
		estud.nota1 = input.nextDouble();
		estud.nota2 = input.nextDouble();
		estud.nota3 = input.nextDouble();
		
		System.out.printf("Média Final é: %.2f%n", estud.mediaFinal());
		
		if (estud.mediaFinal() < 60.0)
		{
			System.out.println("Infelizmente você não foi aprovado !!!");
			System.out.printf("Ficou faltando: %.2f%n", estud.faltaPontos());
		}
		else
		{
			System.out.println("Você foi aprovado !!!");
		}
		
		input.close();
	}

}
