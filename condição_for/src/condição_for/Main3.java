package condição_for;

import java.util.Scanner;

public class Main3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		for (int i=0; i<n; i++) 
		{
			
			int x = input.nextInt();
			int y = input.nextInt();
			
			if (y == 0) 
			{
				System.out.println("divisao impossivel");
			}
			else 
			{
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		input.close();
	}

}
