package condição_for;

import java.util.Locale;
import java.util.Scanner;

public class Main2
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for (int i = 0 ; i < n ; i++)
		{
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", media);
		}
		
		input.close();
	}

}
