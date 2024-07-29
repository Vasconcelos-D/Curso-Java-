package exerc_07;

import java.util.Locale;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Quantos valores iram ter cada vetor? ");
		int n = sc.nextInt();
		
		int [] vet = new int[n];
		int [] vect = new int[n];
		int [] rest= new int [n];
		
		System.out.println();
		System.out.println("Digite dos valores do Vector A: ");
		for (int i = 0 ; i < n ; i++)
		{
			vet[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Digite dos valores do Vector b: ");
		for (int i = 0 ; i < n ; i++)
		{
			vect[i] = sc.nextInt();
		}
		
		
		for (int i = 0 ; i < n ; i++)
		{
			rest[i] = vet[i] + vect[i];
		}
		
		
		System.out.println();
		System.out.println("Valor Resultante de A + B : ");
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.printf("%d\n", rest[i]);
		}
		sc.close();
	}

}
