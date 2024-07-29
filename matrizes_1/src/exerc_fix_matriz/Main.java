package exerc_fix_matriz;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com os numeros");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for ( int i = 0 ; i < m ; i++)
		{
			for ( int j = 0 ; j < n ; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		
		for ( int i = 0 ; i < m ; i++)
		{
			for ( int j = 0 ; j < n ; j++)
			{
				if (mat[i][j] == x)
				{
					System.out.println("Posição: " + i + "," + j + ":");
					if (j > 0)
					{
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0)
					{
						System.out.println("Cima: " + mat[i-1][j]);
					}
					if (j < n-1)
					{
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < m-1)
					{
						System.out.println("Baixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();	
	}
}
