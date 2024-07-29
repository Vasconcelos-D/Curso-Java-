package exerc_10;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int maioridade, posicaomaior;
		
		System.out.print("Quantas pessoas você vai digitar ?");
		int n = sc.nextInt();
		
		String [] nome = new String[n];
		int [] idade = new int[n];
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.printf("Dados da %da pessoa\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		maioridade = idade[0];
		posicaomaior = 0;
		for (int i = 1 ; i < n ; i++)
		{
			if(idade[i] > maioridade)
			{
				maioridade = idade[i];
				posicaomaior = i;
			}
		}
		
		System.out.printf("Pessoa mais velha é: %s\n", nome[posicaomaior] );
		
		sc.close();
	}

}
