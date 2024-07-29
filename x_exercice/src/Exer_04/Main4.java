package Exer_04;

import java.util.Locale;
import java.util.Scanner;

public class Main4
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Entre com valor de X: ");
		double x = sc.nextDouble();
	
		System.out.print("Entre com valor de Y: ");
		double y = sc.nextDouble();
	
	
	
		if (x == 0.0 && y == 0.0)
		{
				System.out.println("Origem");
		}
		else if (x == 0.0)
		{
				System.out.println("Eixo Y");
		}
		else if (y == 0.0){	
				System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0)
		{
				System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0)
		{
				System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0)
		{
				System.out.println("Q3");
		}
		else{
				System.out.println("Q4");
		}
	
		sc.close();
	
	}
}
