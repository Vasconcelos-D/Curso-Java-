package exerc_12;

import java.util.Locale;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantH, quantM;
		double menorAlt, maiorAlt, altFM, altFMT;
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		double [] alt = new double[n];
		char [] sex = new char[n];
		
		for (int i = 0 ; i < n ; i++)
		{
			System.out.printf("Altura da %d pessoa\n", i + 1);
			System.out.print("Altura:");
			alt [i] = sc.nextDouble();
			System.out.printf("Genero da %d pessoa\n", i + 1);
			System.out.print("Genero:");
			sex [i] = sc.next().charAt(0);
		}
		menorAlt = alt[0];
		maiorAlt = alt[0];
		for (int i = 0 ; i < n ; i++)
		{
			if(alt[i] > maiorAlt)
			{
				maiorAlt = alt[i];
			}
			if (alt[i] < menorAlt)
			{
				menorAlt = alt[i];
			}
		}
		quantH = 0;
		quantM = 0;
		altFMT = 0;
		
		for (int i = 0 ; i < n ; i++)
		{
			if (sex[i] == 'M')
			{
				quantH++;
			}
			else
			{
				quantM++;
				altFMT = altFMT + alt[i];
			}
		}
		
		altFM = altFMT / quantM;
		
		System.out.printf("Menor altura = %.2f\n", menorAlt);
		System.out.printf("Maior altura = %.2f\n", maiorAlt);
		System.out.printf("Media das alturas das Mulheres = %.2f\n", altFM);
		System.out.printf("Número dos Homnes = %d\n", quantH);

		
		sc.close();
	}

}
