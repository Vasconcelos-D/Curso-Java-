package exerc_06;

import java.util.Locale;
import java.util.Scanner;

public class Program
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int posmaior = 0;
		double maior;
		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();
             
		double [] vect = new double[n];
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.print("Digite um int: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		for (int i = 0 ; i < n ; i++)
		{
			if (vect[i] > maior)
			{
				maior = vect[i];
				posmaior = i;
			}
		}
		
		System.out.printf("Maior Valor = %.1f\n", maior);
		System.out.printf("Posição Maior = %d\n", posmaior);
		sc.close();
	}

}
