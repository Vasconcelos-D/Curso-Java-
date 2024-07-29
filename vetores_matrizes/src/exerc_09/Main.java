package exerc_09;

import java.util.Locale;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double somapar = 0  ,npar = 0;
		double mediapar;
		
		System.out.print("Quantos elementos irá ter no vetor? ");
		int n = sc.nextInt();
		
		double[] par = new double[n];
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.print("Digie um número: ");
			par[i] = sc.nextDouble();
		}
		
		for (int i = 0 ; i < n ; i++)
		{
			if(par[i] % 2 == 0)
			{
				somapar += par[i];
				npar++;
			}
		}
		
		if (npar == 0)
		{
			System.out.println("Nem um par: ");
		}
		else 
		{
			mediapar = (double) somapar / npar;
			System.out.printf("Media dos pares: %.1f\n ", mediapar);
		}
		sc.close();
	}

}
