package condição_for;
// Programa para calcular todos os divisores de um número.
import java.util.Scanner;

public class Main5
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		for (int i = 1 ; i <= x ; i++)
		{
			if (x % i == 0)
			{
				System.out.println(i);
			}
		}
	
		input.close();
	}

}
