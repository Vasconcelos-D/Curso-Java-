package exerc_08;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media = 0;
		
		System.out.print("Quantos elementos o vetor vai ter ? ");
		int n = sc.nextInt();
		
		double[] nota = new double [n];
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.print("Digite um número: ");
			nota[i] = sc.nextDouble();
		}
		
		for (int i = 0 ; i < n ; i++)
		{
			media += nota[i] / n;
		}
		
		
		
		System.out.printf("Elementos do vetor: %.3f\n", media);
		System.out.println("Elementos abaixo da media: ");
		
		for  (int i = 0 ; i < n ; i++)
		{
			if(nota[i] < media) 
			{
			System.out.printf("%.1f\n", nota[i]);	
			}
		}
		sc.close();
	}
}
