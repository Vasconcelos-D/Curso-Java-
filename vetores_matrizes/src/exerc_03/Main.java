package exerc_03;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor inicial: ");
		int n = sc.nextInt();
		
		int[] vect = new int [n];
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.print("Entre com um inteiro:");
			vect[i] = sc.nextInt();
		}
		
		System.out.print("Numeros impares: ");
		int iPar = 0;
		int nPar = 0;
		
		
		for (int i = 0 ; i < n ; i++)
		{
			if (vect[i] % 2 == 1)
			{
				System.out.printf("%d ", vect[i]);
				iPar++;
			}
		}
		System.out.println();
		System.out.print("Numeros pares : ");
		
		for (int p = 0 ; p < n ; p++)
		{
			if (vect[p] %2 == 0)
			{
				System.out.printf("%d ", vect[p]);
				nPar++;
			}
		
		}
		
		System.out.printf("\n\nQuantidade de impares = %d\n", iPar);
		System.out.printf("\n\nQuantidade de pares = %d\n", nPar);
		sc.close();
	}

}
