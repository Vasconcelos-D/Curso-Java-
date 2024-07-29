package condição_for;

import java.util.Scanner;

public class Main4 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o numero fatorial:");
		int n = input.nextInt();
		int fat = 1;
		
		for (int i = 1 ; i <= n ; i++)
		{
			fat = fat * i;
		}
		System.out.println("O numero fatorial é: " + fat);
		
		input.close();
	}
}
