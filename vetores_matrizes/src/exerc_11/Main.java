package exerc_11;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media;
		System.out.printf("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String [] nome = new String[n];
		double [] not1 = new double[n];
		double [] not2 = new double[n];
		
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.printf("Digite o nome, primeira e segunda nota do %sa aluno\n",i+1);
			System.out.printf("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.printf("Nota 01: ");
			not1[i] = sc.nextDouble();
			System.out.printf("Nota 02: ");
			not2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0 ; i < n ; i++)
		{
			media = (not1[i] + not2[i]) / 2;
	
			if(media >= 6.0)
			{
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		sc.close();
	}
}
